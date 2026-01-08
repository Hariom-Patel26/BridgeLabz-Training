package com.loanbuddyapplication;

public interface IApprovable {

    boolean approveLoan(Applicant applicant);

    double calculateEmi(double principal);
}