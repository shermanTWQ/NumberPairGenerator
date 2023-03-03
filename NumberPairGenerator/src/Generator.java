//Program to show declaration of variables
//without initialization

// This program generate a set of numbers from 1 - 49. 
// Tan Wei Qiang Sherman (C) 2023.

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    //Declaration of variables
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		String number;
		
		System.out.println("How many pairs of numbers would you like to generate? : ");
	    number = input.nextLine();
	    input.close();
	    
	    int newNumber =  Integer.parseInt(number);
	    
	    for (int i=0; i<newNumber; i++)
	    {
	    	System.out.println("Random Integer: " +random.nextInt(50));
	    }
	}
}
