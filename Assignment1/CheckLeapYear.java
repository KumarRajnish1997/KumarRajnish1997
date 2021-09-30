package com.broadridge.assignment;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Its a leap year");
	      else
	         System.out.println("Its not a leap year");
	   }

	}


