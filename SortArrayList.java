package com.broadridge.assignment4;

	import java.util.ArrayList;
	import java.util.Collections;

	public class SortArrayList {
		public static void main(String args[]){
			   ArrayList<String> listofcountries = new ArrayList<String>();
			   listofcountries.add("India");
			   listofcountries.add("Australia");
			   listofcountries.add("USA");
			   listofcountries.add("England");

			   /*Unsorted List*/
			   System.out.println("Before Sorting:");
			   for(String counter: listofcountries){
					System.out.println(counter);
				}

			   /* Sort statement*/
			   Collections.sort(listofcountries);

			   /* Sorted List*/
			   System.out.println("After Sorting:");
			   for(String counter: listofcountries){
					System.out.println(counter);
				}
			}

	}


