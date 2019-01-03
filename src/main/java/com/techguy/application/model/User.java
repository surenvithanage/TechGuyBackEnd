package com.techguy.application.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Suren Vithanage
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "userId")
	private Integer userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "age")
	private Integer age;
	@NotNull(message = "Email Cannot be Empty")
	@Column(name = "email")
	private String email;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "addressLineOne")
	private String addressLineOne;
	@Column(name = "addressLineTwo")
	private String addressLineTwo;
	@Column(name = "city")
	private String city;
	@Column(name = "cityCode")
	private String cityCode;
	@Column(name = "province")
	private String province;
	@Column(name = "country")
	private String country;
	@NotNull(message = "Password Cannot be Empty")
	@Column(name = "password")
	private String password;
	@Column(name = "proPicture")
	private String proPicture;
	@Column(name = "loggingAttempt")
	private String loggingAttempt;
	@Column(name = "enabled")
	private boolean enabled;
	@Column(name = "confirmationToken")
	private String confirmationToken;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "useruserId")
	private List<Review> reviewList;
	@JoinColumn(name = "Admin_admId", referencedColumnName = "admId")
	@ManyToOne()
	private Admin adminadmId;
	@JoinColumn(name = "CVData_cvDataId", referencedColumnName = "cvDataId")
	@ManyToOne()
	private Cvdata cVDatacvDataId;
	@JoinColumn(name = "Company_companyId", referencedColumnName = "companyId")
	@ManyToOne()
	private Company companycompanyId;
	@JoinColumn(name = "JobRole_jobRoleId", referencedColumnName = "jobRoleId")
	@ManyToOne()
	private Jobrole jobRolejobRoleId;

	public User() {
	}

	public User(Integer userId) {
		this.userId = userId;
	}

	public User(Integer userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProPicture() {
		return proPicture;
	}

	public void setProPicture(String proPicture) {
		this.proPicture = proPicture;
	}

	public String getLoggingAttempt() {
		return loggingAttempt;
	}

	public void setLoggingAttempt(String loggingAttempt) {
		this.loggingAttempt = loggingAttempt;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public Cvdata getcVDatacvDataId() {
		return cVDatacvDataId;
	}

	public void setcVDatacvDataId(Cvdata cVDatacvDataId) {
		this.cVDatacvDataId = cVDatacvDataId;
	}

	public List<Review> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public Admin getAdminadmId() {
		return adminadmId;
	}

	public void setAdminadmId(Admin adminadmId) {
		this.adminadmId = adminadmId;
	}

	public Cvdata getCVDatacvDataId() {
		return cVDatacvDataId;
	}

	public void setCVDatacvDataId(Cvdata cVDatacvDataId) {
		this.cVDatacvDataId = cVDatacvDataId;
	}

	public Company getCompanycompanyId() {
		return companycompanyId;
	}

	public void setCompanycompanyId(Company companycompanyId) {
		this.companycompanyId = companycompanyId;
	}

	public Jobrole getJobRolejobRoleId() {
		return jobRolejobRoleId;
	}

	public void setJobRolejobRoleId(Jobrole jobRolejobRoleId) {
		this.jobRolejobRoleId = jobRolejobRoleId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (userId != null ? userId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof User)) {
			return false;
		}
		User other = (User) object;
		if ((this.userId == null && other.userId != null)
				|| (this.userId != null && !this.userId.equals(other.userId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.User[ userId=" + userId + " ]";
	}

}
