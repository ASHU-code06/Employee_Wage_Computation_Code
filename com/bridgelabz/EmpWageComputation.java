package com.bridgelabz;

import java.util.Scanner;

public class EmpWageComputation {
    public static void main(String[] args) {
        EmpWageComputation empWageComputation = new EmpWageComputation();
        empWageComputation.check();
    }
     void check(){
        int maxWorkingHoursPerMonth = 100;//working hours must not exceed than 100 hrs in a month
        int monthlyWorkingDays = 20;
        int wagePerHour = 20;
        int fullTimeHour = 8;//for fulltime Employee
        int partTimeHour = 4;//for parttime Employee
        int parttimeDailyWage ;
        int dailyWage;
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter 1 for fulltime wage else Enter 2 for parttime wage calculation");
        int select = myinput.nextInt();
        switch(select){
            case 1:
                System.out.println("Employee is present and fulltime");
                dailyWage = fullTimeHour * wagePerHour;// Wage for 1 day
                System.out.println("Daily wage of a fulltime employee is "+dailyWage+" rs");
                int totalWages = 0;
                int totalWorkingHours = 0;
                int totalWorkingDays = 0;
                while( totalWorkingDays <= monthlyWorkingDays  && totalWorkingHours < maxWorkingHoursPerMonth){
                    int remainingHours = maxWorkingHoursPerMonth - totalWorkingHours;
                    int remainingDays = monthlyWorkingDays - totalWorkingDays;
                    if (remainingDays > 0 && remainingHours >= fullTimeHour){
                        totalWages += fullTimeHour * wagePerHour;
                        totalWorkingHours += fullTimeHour;
                        totalWorkingDays++;
                    }else if (remainingDays > 0 && remainingHours > 0 && remainingHours < fullTimeHour) {
                        totalWages += remainingHours * wagePerHour;
                        totalWorkingHours += remainingHours;
                    }
                }
                System.out.println("Employee worked for "+totalWorkingHours+" hours  or "+totalWorkingDays+" days so");
                System.out.println("Total wages earned: " + totalWages);
                /*The code then enters a while loop that continues until either the maximum working hours or maximum working days are reached.
                The loop calculates the remaining hours and days that can be worked by the employee and checks if there are any remaining days left to work.
                If so, the code checks if there are enough remaining hours to work a full day.
                If yes, there "are enough remaining hours" to work a full day,
                then it calculates the wages earned for a full day and increments the total working hours and working days.
                If No, there "are not enough hours" to work a full day but still some hours left to work,
                then it calculates the wages earned for the remaining hours and increments the total working hours.
                If there are no hours left to work, the loop breaks.*/
                break;
            case 2:
                System.out.println("Employee is present and parttime ");
                parttimeDailyWage = partTimeHour * wagePerHour ;
                System.out.println("Daily Wage of a parttime employee is "+parttimeDailyWage+" rs");
                int totalWagesp = 0;//total wage of parttime employee
                int totalWorkingHoursp = 0;
                int totalWorkingDaysp = 0;
                while(totalWorkingHoursp < maxWorkingHoursPerMonth && totalWorkingDaysp </*##*/ monthlyWorkingDays){
                    int remainingHoursp = maxWorkingHoursPerMonth - totalWorkingHoursp;
                    int remainingDaysp = monthlyWorkingDays - totalWorkingDaysp;
                    if (remainingDaysp > 0 && remainingHoursp >= partTimeHour){
                        totalWagesp += partTimeHour * wagePerHour;
                        totalWorkingHoursp += partTimeHour;
                        totalWorkingDaysp++;
                    }else if (remainingDaysp > 0 && remainingHoursp > 0 && remainingHoursp < partTimeHour) {
                        totalWagesp += remainingHoursp * wagePerHour;
                        totalWorkingHoursp += remainingHoursp;
                    }
                }
                System.out.println("Employee worked for "+totalWorkingHoursp+" hours  or "+totalWorkingDaysp+" days so");
                System.out.println("Total wages earned: " + totalWagesp);
                break;
            default:
                System.out.println("Employee is absent");
    }

}

}

