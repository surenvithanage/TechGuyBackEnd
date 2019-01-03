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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Suren Vithanage
 */

@Entity
@Table(name = "jobrole")
public class Jobrole implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "jobRoleId")
	private Integer jobRoleId;
	@Column(name = "name")
	private String name;
	@Column(name = "permanent")
	private String permanent;
	@Column(name = "salary")
	private String salary;
	@ManyToMany(mappedBy = "jobroleList")
	private List<Company> companyList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "jobRolejobRoleId")
	private List<User> userList;

	public Jobrole() {
	}

	public Jobrole(Integer jobRoleId) {
		this.jobRoleId = jobRoleId;
	}

	public Integer getJobRoleId() {
		return jobRoleId;
	}

	public void setJobRoleId(Integer jobRoleId) {
		this.jobRoleId = jobRoleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermanent() {
		return permanent;
	}

	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
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
		hash += (jobRoleId != null ? jobRoleId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Jobrole)) {
			return false;
		}
		Jobrole other = (Jobrole) object;
		if ((this.jobRoleId == null && other.jobRoleId != null)
				|| (this.jobRoleId != null && !this.jobRoleId.equals(other.jobRoleId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Jobrole[ jobRoleId=" + jobRoleId + " ]";
	}

}
