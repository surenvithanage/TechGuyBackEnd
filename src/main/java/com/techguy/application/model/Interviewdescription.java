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
@Table(name = "interviewdescription")
public class Interviewdescription implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "interviewDescId")
	private Integer interviewDescId;
	@Column(name = "question")
	private String question;
	@JoinColumn(name = "Interview_interviewId", referencedColumnName = "interviewId")
	@ManyToOne(optional = false)
	private Interview interviewinterviewId;

	public Interviewdescription() {
	}

	public Interviewdescription(Integer interviewDescId) {
		this.interviewDescId = interviewDescId;
	}

	public Integer getInterviewDescId() {
		return interviewDescId;
	}

	public void setInterviewDescId(Integer interviewDescId) {
		this.interviewDescId = interviewDescId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Interview getInterviewinterviewId() {
		return interviewinterviewId;
	}

	public void setInterviewinterviewId(Interview interviewinterviewId) {
		this.interviewinterviewId = interviewinterviewId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (interviewDescId != null ? interviewDescId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Interviewdescription)) {
			return false;
		}
		Interviewdescription other = (Interviewdescription) object;
		if ((this.interviewDescId == null && other.interviewDescId != null)
				|| (this.interviewDescId != null && !this.interviewDescId.equals(other.interviewDescId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Interviewdescription[ interviewDescId=" + interviewDescId + " ]";
	}

}
