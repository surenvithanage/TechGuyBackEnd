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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Suren Vithanage
 */
@Entity
@Table(name = "admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "admId")
	private Integer admId;
	@Basic(optional = false)
	@Column(name = "userName")
	private String userName;
	@Column(name = "email")
	private String email;
	@Column(name = "addressLineOne")
	private String addressLineOne;
	@Column(name = "addresslineTwo")
	private String addresslineTwo;
	@Column(name = "city")
	private String city;
	@Column(name = "cityCode")
	private String cityCode;
	@Column(name = "province")
	private String province;
	@Column(name = "telephone")
	private String telephone;
	@Basic(optional = false)
	@Column(name = "password")
	private String password;
	@Column(name = "proPicture")
	private String proPicture;
	@Column(name = "gender")
	private String gender;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "adminadmId")
	private List<Company> companyList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "adminadmId")
	private List<Interview> interviewList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "adminadmId")
	private List<User> userList;

	public Admin() {
	}

	public Admin(Integer admId) {
		this.admId = admId;
	}

	public Admin(Integer admId, String userName, String password) {
		this.admId = admId;
		this.userName = userName;
		this.password = password;
	}

	public Integer getAdmId() {
		return admId;
	}

	public void setAdmId(Integer admId) {
		this.admId = admId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddresslineTwo() {
		return addresslineTwo;
	}

	public void setAddresslineTwo(String addresslineTwo) {
		this.addresslineTwo = addresslineTwo;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

	
	public List<Interview> getInterviewList() {
		return interviewList;
	}

	public void setInterviewList(List<Interview> interviewList) {
		this.interviewList = interviewList;
	}

	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (admId != null ? admId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Admin)) {
			return false;
		}
		Admin other = (Admin) object;
		if ((this.admId == null && other.admId != null) || (this.admId != null && !this.admId.equals(other.admId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Admin[ admId=" + admId + " ]";
	}

}

