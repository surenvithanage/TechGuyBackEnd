package com.techguy.application.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Suren Vithanage
 */

@Entity
@Table(name = "project")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "projectId")
	private Integer projectId;
	@Column(name = "projectName")
	private String projectName;
	@Column(name = "description")
	private String description;
	@Column(name = "durationFrom")
	@Temporal(TemporalType.DATE)
	private Date durationFrom;
	@Column(name = "durationTo")
	@Temporal(TemporalType.DATE)
	private Date durationTo;
	@JoinTable(name = "technology_has_project", joinColumns = {
			@JoinColumn(name = "Project_projectId", referencedColumnName = "projectId") }, inverseJoinColumns = {
					@JoinColumn(name = "Technology_technologyId", referencedColumnName = "technologyId") })
	@ManyToMany
	private List<Technology> technologyList;
	@JoinColumn(name = "CVData_cvDataId", referencedColumnName = "cvDataId")
	@ManyToOne(optional = false)
	private Cvdata cVDatacvDataId;

	public Project() {
	}

	public Project(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<Technology> getTechnologyList() {
		return technologyList;
	}

	public void setTechnologyList(List<Technology> technologyList) {
		this.technologyList = technologyList;
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
		hash += (projectId != null ? projectId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Project)) {
			return false;
		}
		Project other = (Project) object;
		if ((this.projectId == null && other.projectId != null)
				|| (this.projectId != null && !this.projectId.equals(other.projectId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Project[ projectId=" + projectId + " ]";
	}

}
