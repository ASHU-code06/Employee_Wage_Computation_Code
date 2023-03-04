package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class EmpWageComputation {
    public static void main(String[] args) {
        EmpWageComputation empWageComputation = new EmpWageComputation();
        empWageComputation.check();
    }
     void check(){
        int wagePerHour = 20;
        int fullDayHour = 8;//for fulltime Employee
        int fulltimeDailyWage ;
        int partTimeHour = 4;//for parttime Employee
        int parttimeDailyWage ;
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter 1 for fulltime wage else Enter 2 for parttime wage calculation");
        int select = myinput.nextInt();
        switch(select){
            case 1:
                System.out.println("Employee is present and fulltime");
                fulltimeDailyWage = fullDayHour * wagePerHour;
                System.out.println("Daily wage of a fulltime employee is "+fulltimeDailyWage+" rs");
                break;
            case 2:
                System.out.println("Employee is present and parttime ");
                parttimeDailyWage = partTimeHour * wagePerHour ;
                System.out.println("Daily Wage of a parttime employee is "+parttimeDailyWage+" rs");
                break;
            default:
                System.out.println("Employee is absent");
        }
    }
}

