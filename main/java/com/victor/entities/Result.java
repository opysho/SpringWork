package com.victor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Result")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "result_id")
	private int id;
	private int courseId;
	private double assignmentMarks;
	private double testMarks;
	private double examMarks;
	private double averageMarks;

	public Result() {
		super();
	}

	public Result(int id, int courseId, double assignmentMarks, double testMarks, double examMarks,
			double averageMarks) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.assignmentMarks = assignmentMarks;
		this.testMarks = testMarks;
		this.examMarks = examMarks;
		this.averageMarks = averageMarks;
	}

	public Result(int courseId, double assignmentMarks, double testMarks, double examMarks, double averageMarks) {
		super();
		this.courseId = courseId;
		this.assignmentMarks = assignmentMarks;
		this.testMarks = testMarks;
		this.examMarks = examMarks;
		this.averageMarks = averageMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public double getAssignmentMarks() {
		return assignmentMarks;
	}

	public void setAssignmentMarks(double assignmentMarks) {
		this.assignmentMarks = assignmentMarks;
	}

	public double getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(double testMarks) {
		this.testMarks = testMarks;
	}

	public double getExamMarks() {
		return examMarks;
	}

	public void setExamMarks(double examMarks) {
		this.examMarks = examMarks;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(double averageMarks) {
		this.averageMarks = averageMarks;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", courseId=" + courseId + ", assignmentMarks=" + assignmentMarks + ", testMarks="
				+ testMarks + ", examMarks=" + examMarks + ", averageMarks=" + averageMarks + "]";
	}

}
