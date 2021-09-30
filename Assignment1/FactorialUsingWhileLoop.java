package com.broadridge.assignment;

import java.util.Scanner;

public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;  
        int i = 1;  
  
		Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter a number: ");  
        int num = sc.nextInt();  
          
        //counting the factorial using while loop  
        while( i <= num ){  
            factorial = factorial * i;   
            i++;   
        }     
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + factorial);  
    }   


	}

