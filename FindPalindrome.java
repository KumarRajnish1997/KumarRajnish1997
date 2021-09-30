package com.broadridge.assignment3;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "trurt", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a palindrome");
	    }
	    else {
	      System.out.println(str + " is not a palindrome");
	    }
	  }

	}


