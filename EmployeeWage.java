package com.employeWage;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
    int fullTime;
    int partTime;
    int wagePerHour ;
    static int empHour ;
    static int wage = 0;
    int monthlyWage =0;
    int monthlyHour =0;
    String companyName ;
    int noOfWorkingDays;
    int noOfWorkingHours;

    EmployeeWage(String companyName,int wagePerHour, int noOfWorkingDays, int noOfWorkingHours, int partTime,int fullTime) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.noOfWorkingHours = noOfWorkingDays;
        this.partTime = partTime;
        this.fullTime = fullTime;

        System.out.println("Company Name : " + companyName + "\t Wage Per Hour : " + wagePerHour + "\t Number of Minimum Working Days in a month : " + noOfWorkingDays);
//        System.out.println();
        System.out.println("Number of minimum Working Hours in a month:" + noOfWorkingHours+"\t Part Time Hours : "+partTime+"\t Full Time Hours : "+fullTime);
    }

    void WageCalculation() {
        Random r = new Random();
        int n = r.nextInt(3);

        // UC4 Switch case used to check employee attendance status
        switch (n) { // UC1 to check the Employee is present or absent using RANDOM class.
            case 0:
                empHour = fullTime;
                System.out.println();
                System.out.println("Employee is Present for " + empHour + " hours. ");
                break;
            case 1:// UC3 to add employee hours present for part time
                empHour = partTime;
                System.out.println();
                System.out.println("Employee present for part time for " + empHour + " hours. ");
                break;

            default:
                empHour = 0;
                System.out.println();
                System.out.println("Employee is Absent so no salary for him...");
        }

        wage = wagePerHour * empHour; // UC2 to calculate the daily wage for present employee
        System.out.println("Employee Wage for one day is: " + wage);

    }
    int MonthlyWageCal(int workDays) {
        //uc5 to calculate monthly wage of employee

        this.monthlyWage = wage * workDays;
        int monthlyHour = empHour * workDays;
        System.out.println("Employee working hours in one month is: "+monthlyHour);
        System.out.println("Employee this month salary will be : " + monthlyWage);
        return monthlyWage;
    }
    void WorkPolicy(int workDays){

        System.out.println("");//uc6 to check if the Employee working hours or days meets the company requirements
        // i.e. working days atleast should be 20 in a month or minimum of 100 working hours
        if (workDays >= noOfWorkingDays || monthlyHour >=noOfWorkingHours){
            System.out.println("Worker Satisfies the payscale condition.");
            System.out.println("The Final Salary will be credited to Workers  bank account is: " + monthlyWage);
        }
        else{
            System.out.println("Worker did not satisfies the payscale condition.");
            System.out.println("Worker needs to work for more hour or minimum for "+noOfWorkingDays+" days or minimum of "+noOfWorkingHours+" hours ");
        }

    }
    public static void main(String[] args) {
        System.out.println("------------------Welcome to Employee Wage Calculation Program!-------------------");
        System.out.println();
        EmployeeWage emp = new EmployeeWage("DELL",25,15,80,3,6);
        //Number of Company Names and other parameters can be added in the constructor to use Employee Wage calculation program for multiple companies
        Scanner sc = new Scanner(System.in);
        emp.WageCalculation();
        System.out.print("Enter Employee WorkDays: ");
        int workDays = sc.nextInt();
        emp.MonthlyWageCal(workDays);
        emp.WorkPolicy(workDays);
    }
    }

