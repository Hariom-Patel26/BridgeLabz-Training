package com.loanbuddyapplication;

public class Applicant {
	private int creditScore ;
	private double income ;
	private double loanAmount ;
	private String name ;
	
	Applicant (int creditScore, double income, double loanAmount, String name) {
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount ;
		this.name = name;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public double getIncome() {
		return income;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public String getName() {
		return name;
	}
}