package com.bridgelabz;

import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        int r;
        int wagePerHour = 20;
        int fullDayHour = 8;//for fulltime Employee
        int fulltimeDailyWage ;
        int partTimeHour = 4;//for parttime Employee
        int parttimeDailyWage ;
        Random ran = new Random();
        r= ran.nextInt(3);
        System.out.println("random number is  "   +r);
        if(r==0){
            System.out.println("Employee is absent");
        }
        if(r==1){
            System.out.println("Employee is present and fulltime");
            fulltimeDailyWage = fullDayHour * wagePerHour;
            System.out.println("Daily wage of a fulltime employee is "+fulltimeDailyWage+" rs");
        }
        if (r==2){
            System.out.println("Employee is present and parttime ");
            parttimeDailyWage = partTimeHour * wagePerHour ;
            System.out.println("Daily Wage of a parttime employee is "+parttimeDailyWage+" rs");
        }
    }
}

