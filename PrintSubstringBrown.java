package com.broadridge.assignment3;

public class PrintSubstringBrown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "A brown fox ran away fast";
	    String str1 = "brown";

	    boolean result = txt.contains(str1);
	    if(result) {
	      System.out.println(str1 + " is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is not present in the string.");
	    }
	    }

	}


