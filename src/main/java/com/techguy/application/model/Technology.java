package com.techguy.application.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Suren Vithanage
 */

@Entity
@Table(name = "technology")
public class Technology implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "technologyId")
	private Integer technologyId;
	@Column(name = "name")
	private String name;
	@ManyToMany(mappedBy = "technologyList")
	private List<Project> projectList;
	@ManyToMany(mappedBy = "technologyList")
	private List<Cvdata> cvdataList;

	public Technology() {
	}

	public Technology(Integer technologyId) {
		this.technologyId = technologyId;
	}

	public Integer getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(Integer technologyId) {
		this.technologyId = technologyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public List<Cvdata> getCvdataList() {
		return cvdataList;
	}

	public void setCvdataList(List<Cvdata> cvdataList) {
		this.cvdataList = cvdataList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (technologyId != null ? technologyId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Technology)) {
			return false;
		}
		Technology other = (Technology) object;
		if ((this.technologyId == null && other.technologyId != null)
				|| (this.technologyId != null && !this.technologyId.equals(other.technologyId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Technology[ technologyId=" + technologyId + " ]";
	}

}
