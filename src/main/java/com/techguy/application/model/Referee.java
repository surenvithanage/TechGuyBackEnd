package com.techguy.application.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Suren Vithanage
 */

@Entity
@Table(name = "referee")
public class Referee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "refereeId")
	private Integer refereeId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
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
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "email")
	private String email;
	@Column(name = "jobRole")
	private String jobRole;
	@Column(name = "status")
	private String status;
	@JoinColumn(name = "CVData_cvDataId", referencedColumnName = "cvDataId")
	@ManyToOne(optional = false)
	private Cvdata cVDatacvDataId;

	public Referee() {
	}

	public Referee(Integer refereeId) {
		this.refereeId = refereeId;
	}

	public Integer getRefereeId() {
		return refereeId;
	}

	public void setRefereeId(Integer refereeId) {
		this.refereeId = refereeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Cvdata getCVDatacvDataId() {
		return cVDatacvDataId;
	}

	public void setCVDatacvDataId(Cvdata cVDatacvDataId) {
		this.cVDatacvDataId = cVDatacvDataId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (refereeId != null ? refereeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Referee)) {
			return false;
		}
		Referee other = (Referee) object;
		if ((this.refereeId == null && other.refereeId != null)
				|| (this.refereeId != null && !this.refereeId.equals(other.refereeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Referee[ refereeId=" + refereeId + " ]";
	}

}
