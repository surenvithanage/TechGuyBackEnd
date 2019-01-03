package com.techguy.application.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Suren Vithanage
 */
@Entity
@Table(name = "cvdata")
public class Cvdata implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cvDataId")
	private Integer cvDataId;
	@Column(name = "surname")
	private String surname;
	@Column(name = "initials")
	private String initials;
	@Column(name = "addressLineOne")
	private String addressLineOne;
	@Column(name = "addressLineTwo")
	private String addressLineTwo;
	@Column(name = "city")
	private String city;
	@Column(name = "province")
	private String province;
	@Column(name = "cityCode")
	private String cityCode;
	@Column(name = "country")
	private String country;
	@Column(name = "linkedInAddress")
	private String linkedInAddress;
	@Column(name = "githubAddress")
	private String githubAddress;
	@Column(name = "position")
	private String position;
	@JoinTable(name = "technology_has_cvdata", joinColumns = {
			@JoinColumn(name = "CVData_cvDataId", referencedColumnName = "cvDataId") }, inverseJoinColumns = {
					@JoinColumn(name = "Technology_technologyId", referencedColumnName = "technologyId") })
	@ManyToMany
	private List<Technology> technologyList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cVDatacvDataId")
	private List<Project> projectList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cVDatacvDataId")
	private List<Experience> experienceList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cVDatacvDataId")
	private List<Referee> refereeList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cVDatacvDataId")
	private List<User> userList;

	public Cvdata() {
	}

	public Cvdata(Integer cvDataId) {
		this.cvDataId = cvDataId;
	}

	public Integer getCvDataId() {
		return cvDataId;
	}

	public void setCvDataId(Integer cvDataId) {
		this.cvDataId = cvDataId;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLinkedInAddress() {
		return linkedInAddress;
	}

	public void setLinkedInAddress(String linkedInAddress) {
		this.linkedInAddress = linkedInAddress;
	}

	public String getGithubAddress() {
		return githubAddress;
	}

	public void setGithubAddress(String githubAddress) {
		this.githubAddress = githubAddress;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Technology> getTechnologyList() {
		return technologyList;
	}

	public void setTechnologyList(List<Technology> technologyList) {
		this.technologyList = technologyList;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public List<Experience> getExperienceList() {
		return experienceList;
	}

	public void setExperienceList(List<Experience> experienceList) {
		this.experienceList = experienceList;
	}

	public List<Referee> getRefereeList() {
		return refereeList;
	}

	public void setRefereeList(List<Referee> refereeList) {
		this.refereeList = refereeList;
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
		hash += (cvDataId != null ? cvDataId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cvdata)) {
			return false;
		}
		Cvdata other = (Cvdata) object;
		if ((this.cvDataId == null && other.cvDataId != null)
				|| (this.cvDataId != null && !this.cvDataId.equals(other.cvDataId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Cvdata[ cvDataId=" + cvDataId + " ]";
	}

}
