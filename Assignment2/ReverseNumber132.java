package com.broadridge.assignment2;

public class ReverseNumber132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse number is: " + reverse);  
		}  
	

	}


