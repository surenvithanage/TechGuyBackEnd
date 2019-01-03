package com.techguy.application.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techguy.application.email.EmailService;
import com.techguy.application.model.User;
import com.techguy.application.repository.UserRepository;
import com.techguy.application.service.UserService;

@RestController
@RequestMapping("/user")
//@CrossOrigin("http://localhost:4200")
public class UserController {

	private UserService userService;
	private EmailService emailService;
	private UserRepository userRepository;

	@Autowired
	public UserController(UserService userService, EmailService emailService, UserRepository userRepository) {
		this.userRepository = userRepository;
		this.emailService = emailService;
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<User> add(@Valid @RequestBody User user, HttpServletRequest request) {
		try {
			user.setEnabled(false);
			user.setConfirmationToken(UUID.randomUUID().toString());
			String appUrl = request.getScheme() + "://" + request.getServerName();
			String mailBody = "To confirm your registration with techguy.lk please click on the link given below \n"
					+ "Link : - " + appUrl + ":8080/confirm?token=" + user.getConfirmationToken();
			emailService.sendEmail(user.getEmail(), "Registration Successfull", mailBody);
			return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
		return userService.deleteUser(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/users")
	public ResponseEntity<String> deleteAllUsers() {
		return userService.deleteAllUsers();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/list/{id}")
	public User getUser(@PathVariable("id") int id) {
		return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
	public ResponseEntity<User> updateUser(@Valid @PathVariable("id") int id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/username")
	public ResponseEntity<User> findByUserName( @Valid @RequestBody User userDetails) {
		User user = null;
		try {
			user = userRepository.findByUserName(userDetails.getUserName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (user.getUserName().equals(userDetails.getUserName()))
			return new ResponseEntity<>(user, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/confirmationToken")
	public ResponseEntity<User> findByConfirmationToken(@Valid @RequestBody User userDetails) {
		User user = null;
		try {
			user = userRepository.findByConfirmationToken(userDetails.getConfirmationToken());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (user.getConfirmationToken().equals(userDetails.getConfirmationToken()))
			return new ResponseEntity<>(user, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(method = RequestMethod.GET , value = "/email")
	public ResponseEntity<User> findByEmail(@Valid @RequestBody User userDetails) {
		User user = null;
		try {
			user = userRepository.findByEmail(userDetails.getEmail());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (user.getEmail().equals(userDetails.getEmail())) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(method = RequestMethod.GET , value = "/password")
	public ResponseEntity<User> findByPassword(@Valid @RequestBody User userDetails) {
		User user = null;
		try {
			user = userRepository.findByPassword(userDetails.getPassword());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (user.getPassword().equals(userDetails.getPassword())) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
