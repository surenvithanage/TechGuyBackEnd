package com.techguy.application.model;
// Generated Jan 3, 2019 9:27:06 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CompanyHasJobrole generated by hbm2java
 */
@Entity
@Table(name="company_has_jobrole"
    ,catalog="techguy"
)
public class CompanyHasJobrole  implements java.io.Serializable {


     private CompanyHasJobroleId id;
     private Company company;
     private Jobrole jobrole;
     private String salary;

    public CompanyHasJobrole() {
    }

	
    public CompanyHasJobrole(CompanyHasJobroleId id, Company company, Jobrole jobrole) {
        this.id = id;
        this.company = company;
        this.jobrole = jobrole;
    }
    public CompanyHasJobrole(CompanyHasJobroleId id, Company company, Jobrole jobrole, String salary) {
       this.id = id;
       this.company = company;
       this.jobrole = jobrole;
       this.salary = salary;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="companyCompanyId", column=@Column(name="Company_companyId", nullable=false) ), 
        @AttributeOverride(name="jobRoleJobRoleId", column=@Column(name="JobRole_jobRoleId", nullable=false) ) } )
    public CompanyHasJobroleId getId() {
        return this.id;
    }
    
    public void setId(CompanyHasJobroleId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Company_companyId", nullable=false, insertable=false, updatable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="JobRole_jobRoleId", nullable=false, insertable=false, updatable=false)
    public Jobrole getJobrole() {
        return this.jobrole;
    }
    
    public void setJobrole(Jobrole jobrole) {
        this.jobrole = jobrole;
    }

    
    @Column(name="salary", length=45)
    public String getSalary() {
        return this.salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }




}


