package com.bridgelabz;

import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
            int r;
            Random ran = new Random();
            r= ran.nextInt(3);
            System.out.println("random number is  "   +r);
            if(r==0){
                System.out.println("Employee is absent");
            }
            if(r==1){
                System.out.println("Employee is present and fulltime");
            }
            if (r==2){
                System.out.println("Employee is present and parttime ");
            }
        }
    }

