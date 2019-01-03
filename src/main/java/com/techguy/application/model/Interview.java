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

/**
 * @author suren Vithanage
 */

@Entity
@Table(name = "interview")
public class Interview implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "interviewId")
	private Integer interviewId;
	@Column(name = "technology")
	private String technology;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "interviewinterviewId")
	private List<Interviewdescription> interviewdescriptionList;
	@JoinColumn(name = "Admin_admId", referencedColumnName = "admId")
	@ManyToOne(optional = false)
	private Admin adminadmId;

	public Interview() {
	}

	public Interview(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	
	public List<Interviewdescription> getInterviewdescriptionList() {
		return interviewdescriptionList;
	}

	public void setInterviewdescriptionList(List<Interviewdescription> interviewdescriptionList) {
		this.interviewdescriptionList = interviewdescriptionList;
	}

	public Admin getAdminadmId() {
		return adminadmId;
	}

	public void setAdminadmId(Admin adminadmId) {
		this.adminadmId = adminadmId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (interviewId != null ? interviewId.hashCode() : 0);
		return hash;
	}

}
