package com.broadridge.assignment2;

public class CalculateAverageofNumberUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = { 1, 2, 3, 4, 5 };
		 
        // getting array length
        int length = value.length;
 
        // default sum value.
        int sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
 
        float average = sum / length;
         
        System.out.println("Average of array : "+average);

	}

}
