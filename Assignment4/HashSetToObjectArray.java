package com.broadridge.assignment4;

import java.util.HashSet;
import java.util.Set;

public class HashSetToObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs = new HashSet<Integer>();
	      hs.add(95);
	      hs.add(32);
	      hs.add(21);
	      hs.add(56);
	      hs.add(46);
	      System.out.println("Elements in set = "+hs);
	      System.out.println("Copying all elements:");
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);
	   }

	}


