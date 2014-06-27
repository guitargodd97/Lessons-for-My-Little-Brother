package com.heidenreich.lessons;

public class BooleanExamples {

	public static void main(String args[]) {
		// Create the variables
		boolean one = true;
		boolean two = true;

		// Set to a value
		two = false;
		System.out.println(two);

		// Set to a variable
		two = one;
		System.out.println(two);

		// Changing the variable
		two = true;
		two = !two;
		System.out.println(two);
	}
}
