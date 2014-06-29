package com.heidenreich.lessons;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String name = "";

		System.out.println("Type in your name.");
		name = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("Type in your name to be told to do something by your mother.");
		name = scanner.nextLine();
		name = name.toUpperCase();
		System.out.println(name + " GO READ RIGHT NOW!");
	}

}
