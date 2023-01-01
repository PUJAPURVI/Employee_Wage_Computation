package com.employeWage;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println(".....WEL-COME TO THE EMPLOYEE WAGE COMPUTATION PROGRAM.....");
        Random r = new Random();
        int WagePerHour = 20;
        int empHour;
        int empcheck = r.nextInt(2) + 1;
        //UC1 To check the Employee Attendance
        if (empcheck == 1) {
            empHour=8;
            System.out.println("Employee is present");
        } else {
            empHour=0;
            System.out.println("Employee Is Absent");
        }
        //UC2 To Calculate the daily wage for present Employee
        int Wage = WagePerHour*empHour;
        System.out.println("Employee Wage for one day is: "+Wage);
    }
}
