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
@Table(name = "review")
public class Review implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "reviewId")
	private Integer reviewId;
	@Column(name = "header")
	private String header;
	@Column(name = "description")
	private String description;
	@Column(name = "rating")
	private String rating;
	@Column(name = "pros")
	private String pros;
	@Column(name = "cons")
	private String cons;
	@Column(name = "duration")
	private String duration;
	@JoinColumn(name = "Company_companyId", referencedColumnName = "companyId")
	@ManyToOne(optional = false)
	private Company companycompanyId;
	@JoinColumn(name = "User_userId", referencedColumnName = "userId")
	@ManyToOne(optional = false)
	private User useruserId;

	public Review() {
	}

	public Review(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPros() {
		return pros;
	}

	public void setPros(String pros) {
		this.pros = pros;
	}

	public String getCons() {
		return cons;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Company getCompanycompanyId() {
		return companycompanyId;
	}

	public void setCompanycompanyId(Company companycompanyId) {
		this.companycompanyId = companycompanyId;
	}

	public User getUseruserId() {
		return useruserId;
	}

	public void setUseruserId(User useruserId) {
		this.useruserId = useruserId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (reviewId != null ? reviewId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Review)) {
			return false;
		}
		Review other = (Review) object;
		if ((this.reviewId == null && other.reviewId != null)
				|| (this.reviewId != null && !this.reviewId.equals(other.reviewId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Review[ reviewId=" + reviewId + " ]";
	}

}
