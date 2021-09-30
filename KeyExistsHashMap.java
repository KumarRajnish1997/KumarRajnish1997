package com.broadridge.assignment4;

import java.util.HashMap;

public class KeyExistsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(1,"One");
	    hashmap.put(2,"Two");
	    hashmap.put(3,"Three");
	    hashmap.put(4,"Four");
	    hashmap.put(5,"Five");
	 
	    // Checking Key Existence
	    boolean flag = hashmap.containsKey(2);
	    System.out.println("Key 1 exists in HashMap? : " + flag);
	 
	    boolean flag2 = hashmap.containsKey(5);
	    System.out.println("Key 4 exists in HashMap? : " + flag2);
	 
	    boolean flag3 = hashmap.containsKey(6);
	    System.out.println("Key 6 exists in HashMap? : " + flag3);
	 }


	}


