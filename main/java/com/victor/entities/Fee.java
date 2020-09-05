package com.victor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fee")
public class Fee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fees_id")
	private int id;
	private int personId;
	private double totalCourseFee;
	private double adminFee;
	private double totalAmount;
	private double amountPaid;
	private double balance;

	public Fee() {
		super();
	}

	public Fee(int id, int personId, double totalCourseFee, double adminFee, double totalAmount, double amountPaid,
			double balance) {
		super();
		this.id = id;
		this.personId = personId;
		this.totalCourseFee = totalCourseFee;
		this.adminFee = adminFee;
		this.totalAmount = totalAmount;
		this.amountPaid = amountPaid;
		this.balance = balance;
	}

	public Fee(int personId, double totalCourseFee, double adminFee, double totalAmount, double amountPaid,
			double balance) {
		super();
		this.personId = personId;
		this.totalCourseFee = totalCourseFee;
		this.adminFee = adminFee;
		this.totalAmount = totalAmount;
		this.amountPaid = amountPaid;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public double getTotalCourseFee() {
		return totalCourseFee;
	}

	public void setTotalCourseFee(double totalCourseFee) {
		this.totalCourseFee = totalCourseFee;
	}

	public double getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(double adminFee) {
		this.adminFee = adminFee;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Fee [id=" + id + ", personId=" + personId + ", totalCourseFee=" + totalCourseFee + ", adminFee="
				+ adminFee + ", totalAmount=" + totalAmount + ", amountPaid=" + amountPaid + ", balance=" + balance
				+ "]";
	}

}
