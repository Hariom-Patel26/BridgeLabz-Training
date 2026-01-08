package com.loanbuddyapplication;

public class AutoLoan extends LoanApplication implements IApprovable {

    public AutoLoan(int term, double interestRate) {
        super("AUTO", term, interestRate);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 30000) {

            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEmi(double principal) {
        double monthlyRate = (interestRate + 1) / (12 * 100);
        int months = term * 12;

        return (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}
