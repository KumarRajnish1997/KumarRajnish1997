package com.broadridge.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {
	public static void main(String[] args) {  
        List<String> color = new ArrayList<String>();  
        color.add("Red");  
        color.add("Blue");  
        color.add("Green");  
        System.out.println("Before Reversing");  
        System.out.println(color.toString());  
          
        Collections.reverse(color);  
        System.out.println("After Reversing");  
        System.out.println(color);  
    }  
}