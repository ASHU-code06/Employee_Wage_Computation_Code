package com.bridgelabz;

import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        int r;
        int wagePerHour = 20;
        int fullDayHour = 8;//for fulltime Employee
        int dailyWage ;
        Random ran = new Random();
        r= ran.nextInt(3);
        System.out.println("random number is  "   +r);
        if(r==0){
            System.out.println("Employee is absent");
        }
        if(r==1){
            System.out.println("Employee is present and fulltime");
            dailyWage = fullDayHour * wagePerHour;
            System.out.println("Daily wage of a fulltime employee is "+dailyWage+" rs");
        }
        if (r==2){
            System.out.println("Employee is present and parttime ");
        }
    }
}

