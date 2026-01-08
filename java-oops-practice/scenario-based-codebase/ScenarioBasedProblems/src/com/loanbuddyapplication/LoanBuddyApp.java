/*14. "LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayment plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.
*/


package com.loanbuddyapplication;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Applicant applicant =new Applicant ( 720, 50000, 500000,"Hariom Patel");

        IApprovable loan = new HomeLoan(20, 8.5);

        if (loan.approveLoan(applicant)) {

            LoanApplication loanApp = (LoanApplication) loan;

            System.out.println("Loan Type: " + loanApp.getLoanType());
            System.out.println("Loan Status: " + loanApp.getLoanStatus());

            double emi = loan.calculateEmi(applicant.getLoanAmount());
            System.out.println("Monthly EMI: " + emi);

        } else {
            System.out.println("Loan Rejected");
        }
    }
}
