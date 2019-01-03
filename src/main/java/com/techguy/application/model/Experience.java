package com.techguy.application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Suren Vithanage
 */

@Entity
@Table(name = "experience")
public class Experience implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "experienceId")
	private Integer experienceId;
	@Column(name = "role")
	private String role;
	@Column(name = "company")
	private String company;
	@Column(name = "durationFrom")
	@Temporal(TemporalType.DATE)
	private Date durationFrom;
	@Column(name = "durationTo")
	@Temporal(TemporalType.DATE)
	private Date durationTo;
	@Column(name = "description")
	private String description;
	@JoinColumn(name = "CVData_cvDataId", referencedColumnName = "cvDataId")
	@ManyToOne(optional = false)
	private Cvdata cVDatacvDataId;

	public Experience() {
	}

	public Experience(Integer experienceId) {
		this.experienceId = experienceId;
	}

	public Integer getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(Date durationFrom) {
		this.durationFrom = durationFrom;
	}

	public Date getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(Date durationTo) {
		this.durationTo = durationTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		hash += (experienceId != null ? experienceId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Experience)) {
			return false;
		}
		Experience other = (Experience) object;
		if ((this.experienceId == null && other.experienceId != null)
				|| (this.experienceId != null && !this.experienceId.equals(other.experienceId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Experience[ experienceId=" + experienceId + " ]";
	}

}

