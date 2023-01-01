package com.employeWage;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println(".....WEL-COME TO THE EMPLOYEE WAGE COMPUTATION PROGRAM.....");
        Random r = new Random();
        int WagePerHour = 20;
        int empHour;
        int empcheck = r.nextInt(3);
    // UC4 Switch case used to check employee attendance status
        switch (empcheck) {
            case 0:
                empHour=8;
                //UC1 To check the Employee Attendance
            System.out.println("Employee is present For Full Time "+empHour+" hours. ");
            break;
            //UC3 Employee Wage For Part Time
            case 1:
            empHour=4;
                System.out.println("Employee is present For Part Time "+empHour+" hours.");
                break;
            default:
            empHour=0;
            System.out.println("Employee Is Absent So No Salary For Him..");
        }
        //UC2 To Calculate the daily wage for present Employee
        int Wage = WagePerHour*empHour;
        System.out.println("Employee Wage for one day is: "+Wage);
        //uc5 to calculate monthly wage of employee
        System.out.println("Enter number of working days in one month: ");
        Scanner sc = new Scanner(System.in);
        int workDays = sc.nextInt();
        int monthlyWage = Wage*workDays;
        int monthlyHour = empHour*workDays;
        System.out.println("Employee monthly salary will be : "+monthlyWage);
        //uc6 to check if the Employee working hours or days meets the company requirements
        if (workDays >=20 || monthlyHour >=100){
            System.out.println("Worker work for 20 days or 100 hrs.");
            System.out.println("The worker monthly Salary is: "+monthlyWage);
        }
        else{
            System.out.println("Worker did not work for 20 days or 100 hrs.");
            System.out.println("no salary for worker.");
        }
    }
}
