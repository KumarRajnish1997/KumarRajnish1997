package com.broadridge.assignment3;

public class NumberFormtExcption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      try {
		         new NumberFormtExcption().intParsingMethod();
		      } catch (NumberFormatException e) {
		         System.out.println("If you pass invalid input to parseInt(str), this exception will be thrown.");
		      }
		   }
		   public void intParsingMethod() throws NumberFormatException{
		      int x = Integer.parseInt("4@");
		      System.out.println(x);
		   }

	}


