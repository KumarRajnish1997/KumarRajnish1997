package com.broadridge.assignment3;

public class TestArithmeticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	         int num1=45, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	   }

	}


