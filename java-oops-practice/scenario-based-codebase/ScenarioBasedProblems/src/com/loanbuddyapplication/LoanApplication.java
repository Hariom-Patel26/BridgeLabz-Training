package com.loanbuddyapplication;

public abstract class LoanApplication {
	protected String loanType ;
	protected int term ;
	protected double interestRate ;
	protected String loanStatus ; 
	
	protected LoanApplication (String loanType, int term, double interestRate) {
		this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
	}
        
        protected void setLoanStatus(String status) {
            this.loanStatus = status;
        }

        public String getLoanStatus() {
            return loanStatus;
        }

        public String getLoanType() {
            return loanType;
	}
}
