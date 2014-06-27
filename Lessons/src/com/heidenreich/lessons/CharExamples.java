package com.heidenreich.lessons;

public class CharExamples {

	public static void main(String args[]) {
		// Create variables
		char a = 'a';
		char b = 'b';
		char c = ' ';

		// Set a char to a value
		c = 'c';
		System.out.println(c);

		// Set a char to a variable
		c = a;
		System.out.println(c);

		// Addition
		c = (char) (a + b);
		System.out.println(c);

		// Subtraction
		c = (char) (a - b);
		System.out.println(c);
	}
}
