package com.loanbuddyapplication;

public class PersonalLoan extends LoanApplication implements IApprovable {

    public PersonalLoan(int term, double interestRate) {
        super("PERSONAL", term, interestRate);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 750) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEmi(double principal) {
        double monthlyRate = (interestRate + 2) / (12 * 100);
        int months = term * 12;

        return (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}
