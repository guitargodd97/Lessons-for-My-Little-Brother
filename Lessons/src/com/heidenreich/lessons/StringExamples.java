package com.heidenreich.lessons;

public class StringExamples {

	public static void main(String args[]) {
		String word = "Tasty";
		String drow = new String();

		// Set to a value
		drow = "Hurrah!";
		System.out.println(drow);

		// Set to a variable
		drow = word;
		System.out.println(drow);

		// toUpperCase
		drow = "rabbit";
		drow = drow.toUpperCase();
		System.out.println(drow);

		// toLowerCase
		drow = "YES";
		drow = drow.toLowerCase();
		System.out.println(drow);
	}

}
