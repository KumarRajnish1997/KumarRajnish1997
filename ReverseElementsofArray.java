package com.broadridge.assignment;

import java.util.Scanner;

public class ReverseElementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        n = s.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter "+n+" values ");
        for( i=0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of the array is :");
        for( i=n;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    

	
        }
        
	}
	
}

