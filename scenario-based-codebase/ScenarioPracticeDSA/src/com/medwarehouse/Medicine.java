package com.medwarehouse;

public class Medicine {
	private String name;
	private String batchNumber;
	private String expiryDate; 
	private String branch;

	public Medicine(String name, String batchNumber, String expiryDate, String branch) {
		this.name = name;
		this.batchNumber = batchNumber;
		this.expiryDate = expiryDate;
		this.branch = branch;
	}

	public String toString() {
		return String.format("%-22s | %12s | %s | %s", name, batchNumber, expiryDate, branch);
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public boolean isNearingExpiry() {
		return getExpiryDate().compareTo("2026-04-21") <= 0;
	}
}