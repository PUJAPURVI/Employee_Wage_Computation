package com.employeWage;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWage {

    static int wagePerHour = 20;
    static int empHour;
    int wage = 0;
    int monthlyWage = 0;
    int monthlyHour = 0;

//UC7 - class variable and method use for employee wage calculation


    void WageCalculation() {
        Random r = new Random();
        int n = r.nextInt(3);

        // UC4 Switch case used to check employee attendance status

        switch (n)
        //UC1 To check the Employee Attendance
        {
            case 0:
                empHour = 8;
                System.out.println("Employee is present For Full Time " + empHour + " hours. ");
                break;

            //UC3 Employee Wage For Part Time

            case 1:
                empHour = 4;
                System.out.println("Employee is present For Part Time " + empHour + " hours.");
                break;
            default:
                empHour = 0;
                System.out.println("Employee Is Absent So No Salary For Him..");
        }
        //UC2 To Calculate the daily wage for present Employee

        int Wage = wagePerHour * empHour;
        System.out.println("Employee Wage for one day is: " + Wage);
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
        if (workDays >=20 || monthlyHour >=100){
            System.out.println("Worker Satisfies the payscale condition.");
            System.out.println("The Final Salary will be credited to Workers  bank account is: " + monthlyWage);
        }
        else{
            System.out.println("Worker did not satisfies the payscale condition.");
            System.out.println("Worker needs to work for more hour or minimum for 20 days or minimum of 100 hours ");
        }

    }
    public static void main(String[] args) {
        System.out.println(".....WEL-COME TO THE EMPLOYEE WAGE COMPUTATION PROGRAM.....");
        EmployeeWage emp = new EmployeeWage();
        Scanner sc = new Scanner(System.in);
        emp.WageCalculation();
        System.out.print("Enter Employee WorkDays: ");
        int workDays = sc.nextInt();
        emp.MonthlyWageCal(workDays);
        emp.WorkPolicy(workDays);
    }
    }

