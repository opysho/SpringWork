package com.victor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OtherInformation")
public class OtherInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Other_id")
	private int id;
	private String previousSchoolInfo;
	private String gradeCompleted;
	private String presentGrade;
	private String guardianNames;
	private String guardianAddress;
	private long guardianPhoneNumber;

	public OtherInfo() {
		super();
	}

	public OtherInfo(int id, String previousSchoolInfo, String gradeCompleted, String presentGrade,
			String guardianNames, String guardianAddress, long guardianPhoneNumber) {
		super();
		this.id = id;
		this.previousSchoolInfo = previousSchoolInfo;
		this.gradeCompleted = gradeCompleted;
		this.presentGrade = presentGrade;
		this.guardianNames = guardianNames;
		this.guardianAddress = guardianAddress;
		this.guardianPhoneNumber = guardianPhoneNumber;
	}

	public OtherInfo(String previousSchoolInfo, String gradeCompleted, String presentGrade, String guardianNames,
			String guardianAddress, long guardianPhoneNumber) {
		super();
		this.previousSchoolInfo = previousSchoolInfo;
		this.gradeCompleted = gradeCompleted;
		this.presentGrade = presentGrade;
		this.guardianNames = guardianNames;
		this.guardianAddress = guardianAddress;
		this.guardianPhoneNumber = guardianPhoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPreviousSchoolInfo() {
		return previousSchoolInfo;
	}

	public void setPreviousSchoolInfo(String previousSchoolInfo) {
		this.previousSchoolInfo = previousSchoolInfo;
	}

	public String getGradeCompleted() {
		return gradeCompleted;
	}

	public void setGradeCompleted(String gradeCompleted) {
		this.gradeCompleted = gradeCompleted;
	}

	public String getPresentGrade() {
		return presentGrade;
	}

	public void setPresentGrade(String presentGrade) {
		this.presentGrade = presentGrade;
	}

	public String getGuardianNames() {
		return guardianNames;
	}

	public void setGuardianNames(String guardianNames) {
		this.guardianNames = guardianNames;
	}

	public String getGuardianAddress() {
		return guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}

	public long getGuardianPhoneNumber() {
		return guardianPhoneNumber;
	}

	public void setGuardianPhoneNumber(long guardianPhoneNumber) {
		this.guardianPhoneNumber = guardianPhoneNumber;
	}

	@Override
	public String toString() {
		return "OtherInfo [id=" + id + ", previousSchoolInfo=" + previousSchoolInfo + ", gradeCompleted="
				+ gradeCompleted + ", presentGrade=" + presentGrade + ", guardianNames=" + guardianNames
				+ ", guardianAddress=" + guardianAddress + ", guardianPhoneNumber=" + guardianPhoneNumber + "]";
	}

}
