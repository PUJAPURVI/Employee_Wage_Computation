package com.employeWage;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println(".....WEL-COME TO THE EMPLOYEE WAGE COMPUTATION PROGRAM.....");
        Random r = new Random();
        int empcheck = r.nextInt(2) + 1;
        if (empcheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee Is Absent");
        }
    }
}
