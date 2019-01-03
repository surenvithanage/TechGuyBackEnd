package com.techguy.application.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Suren Vithanage
 */

@Entity
@Table(name = "company")
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "companyId")
	private Integer companyId;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "location")
	private String location;
	@Column(name = "latitude")
	private String latitude;
	@Column(name = "altitude")
	private String altitude;
	@Column(name = "founder")
	private String founder;
	@JoinTable(name = "company_has_jobrole", joinColumns = {
			@JoinColumn(name = "Company_companyId", referencedColumnName = "companyId") }, inverseJoinColumns = {
					@JoinColumn(name = "JobRole_jobRoleId", referencedColumnName = "jobRoleId") })
	@ManyToMany
	private List<Jobrole> jobroleList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companycompanyId")
	private List<Review> reviewList;
	@JoinColumn(name = "Admin_admId", referencedColumnName = "admId")
	@ManyToOne(optional = false)
	private Admin adminadmId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companycompanyId")
	private List<User> userList;

	public Company() {
	}

	public Company(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public List<Jobrole> getJobroleList() {
		return jobroleList;
	}

	public void setJobroleList(List<Jobrole> jobroleList) {
		this.jobroleList = jobroleList;
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

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (companyId != null ? companyId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Company)) {
			return false;
		}
		Company other = (Company) object;
		if ((this.companyId == null && other.companyId != null)
				|| (this.companyId != null && !this.companyId.equals(other.companyId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Company[ companyId=" + companyId + " ]";
	}

}
