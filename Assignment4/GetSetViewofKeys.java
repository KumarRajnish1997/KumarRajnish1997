package com.broadridge.assignment4;

import java.util.Hashtable;
import java.util.Enumeration;

public class GetSetViewofKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
	      ht.put("1", "Red");
	      ht.put("2", "Two");
	      ht.put("3", "Arrange");
	      Enumeration e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
	   }

	}


