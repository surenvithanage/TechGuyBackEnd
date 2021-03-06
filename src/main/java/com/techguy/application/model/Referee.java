package com.techguy.application.model;
// Generated Jan 3, 2019 9:27:06 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Referee generated by hbm2java
 */
@Entity
@Table(name="referee"
    ,catalog="techguy"
)
public class Referee  implements java.io.Serializable {


     private Long refereeId;
     private Cvdata cvdata;
     private String firstName;
     private String lastName;
     private String addressLineOne;
     private String addressLineTwo;
     private String city;
     private String cityCode;
     private String province;
     private String country;
     private String telephone;
     private String email;
     private String jobRole;

    public Referee() {
    }

	
    public Referee(Cvdata cvdata) {
        this.cvdata = cvdata;
    }
    public Referee(Cvdata cvdata, String firstName, String lastName, String addressLineOne, String addressLineTwo, String city, String cityCode, String province, String country, String telephone, String email, String jobRole) {
       this.cvdata = cvdata;
       this.firstName = firstName;
       this.lastName = lastName;
       this.addressLineOne = addressLineOne;
       this.addressLineTwo = addressLineTwo;
       this.city = city;
       this.cityCode = cityCode;
       this.province = province;
       this.country = country;
       this.telephone = telephone;
       this.email = email;
       this.jobRole = jobRole;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="refereeId", unique=true, nullable=false)
    public Long getRefereeId() {
        return this.refereeId;
    }
    
    public void setRefereeId(Long refereeId) {
        this.refereeId = refereeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CVData_cvDataId", nullable=false)
    public Cvdata getCvdata() {
        return this.cvdata;
    }
    
    public void setCvdata(Cvdata cvdata) {
        this.cvdata = cvdata;
    }

    
    @Column(name="firstName", length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="lastName", length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="addressLineOne", length=45)
    public String getAddressLineOne() {
        return this.addressLineOne;
    }
    
    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    
    @Column(name="addressLineTwo", length=45)
    public String getAddressLineTwo() {
        return this.addressLineTwo;
    }
    
    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    
    @Column(name="city", length=45)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="cityCode", length=20)
    public String getCityCode() {
        return this.cityCode;
    }
    
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    
    @Column(name="province", length=45)
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }

    
    @Column(name="country", length=45)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="telephone", length=20)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="jobRole", length=45)
    public String getJobRole() {
        return this.jobRole;
    }
    
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }




}


