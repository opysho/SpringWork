package com.victor.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int id;
	private String title;
	private String surname;
	private String firstName;
	private long identityNumber;
	private String dateOfBirth;
	private int age;
	private String sex;
	private String email;
	private long phoneNumber;
	private String physicalAddress;
	private String post;
	private String password;

	@OneToOne
	@JoinColumn(name = "OtherInfo_id")
	private OtherInfo otherInfo;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Person_course_id")
	private List<Course> courses;

	public Person() {
		super();
	}

	public Person(int id, String title, String surname, String firstName, long identityNumber, String dateOfBirth,
			int age, String sex, String email, long phoneNumber, String physicalAddress, String post) {
		super();
		this.id = id;
		this.title = title;
		this.surname = surname;
		this.firstName = firstName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.physicalAddress = physicalAddress;
		this.post = post;
	}

	public Person(int id, String title, String surname, String firstName, long identityNumber, String dateOfBirth,
			int age, String sex, String email, long phoneNumber, String physicalAddress, String post,
			OtherInfo otherInfo) {
		super();
		this.id = id;
		this.title = title;
		this.surname = surname;
		this.firstName = firstName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.physicalAddress = physicalAddress;
		this.post = post;
		this.otherInfo = otherInfo;
	}

	public Person(int id, String title, String surname, String firstName, long identityNumber, String dateOfBirth,
			int age, String sex, String email, long phoneNumber, String physicalAddress, String post,
			List<Course> courses) {
		super();
		this.id = id;
		this.title = title;
		this.surname = surname;
		this.firstName = firstName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.physicalAddress = physicalAddress;
		this.post = post;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public OtherInfo getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(OtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", title=" + title + ", surname=" + surname + ", firstName=" + firstName
				+ ", identityNumber=" + identityNumber + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", sex="
				+ sex + ", email=" + email + ", phoneNumber=" + phoneNumber + ", physicalAddress=" + physicalAddress
				+ ", post=" + post + ", password=" + password + ", otherInfo=" + otherInfo + ", courses=" + courses
				+ "]";
	}

}
