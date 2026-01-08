package com.loanbuddyapplication;

 class HomeLoan extends LoanApplication implements IApprovable {

    public HomeLoan(int term, double interestRate) {
        super("HOME", term, interestRate);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 40000) {

            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEmi(double principal) {
        double monthlyRate = interestRate / (12 * 100);
        int months = term * 12;

        return (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}

