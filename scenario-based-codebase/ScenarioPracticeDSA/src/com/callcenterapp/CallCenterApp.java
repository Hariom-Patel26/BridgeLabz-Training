package com.callcenterapp;

public class CallCenterApp {
	
	public static void main(String[] args) {
	
		CallCenter callCenter = new CallCenter();
		System.out.println("===== Call Center =====\n");

		// Incoming calls
		callCenter.receiveCall(new Call("C101", "Shivam Tiwari", false, "Internet not working"));
		callCenter.receiveCall(new Call("C205", "Akshat Jain", true, "Billing dispute"));
		callCenter.receiveCall(new Call("C101", "Divyansh Pandey", false, "Slow speed again"));
		callCenter.receiveCall(new Call("C308", "Abhishek Puri Goswami", false, "New connection request"));
		callCenter.receiveCall(new Call("C205", "Hariom Patel", true, "Urgent - port out issue"));
		callCenter.receiveCall(new Call("C412", "Anil singh", false, "Recharge problem"));

		callCenter.showQueueStatus();


		System.out.println("\nAgent starts attending calls...");

		callCenter.attendNextCall();
		callCenter.attendNextCall();
		callCenter.attendNextCall();
		callCenter.attendNextCall();
		
		callCenter.showQueueStatus();


		callCenter.showCallStatistics();

		System.out.println("\n===== Thanks for calling =====");
	}
}
