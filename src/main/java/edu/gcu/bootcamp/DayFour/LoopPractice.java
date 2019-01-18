package edu.gcu.bootcamp.DayFour;

import java.util.Scanner;

public class LoopPractice {
	
	private void forLoop(int dickCheney) {
		System.out.println("For Loop");
		for(int x = 0;x < dickCheney; x++) {
			System.out.println("The FOR counter = " + x);
		}
	}
	
	private void whileLoop(int joeBiden) {
		System.out.println("While Loop");	
		int x = 0;
		while(x < joeBiden) {
			System.out.println("The WHILE counter = " + x);
			x = x + 5;
		}
	}
	
	private void doLoop(int danQuayle) {
		System.out.println("Do Loop");
		int x = 0;
		do {
			System.out.println("The DO counter = " + x);
			x = x + 5;			
		} while( x < danQuayle);
	}
	
	public void demoLoops() {
		System.out.println("How many time do you want to loop?");
		Scanner sc = new Scanner(System.in);
		String loopCounter = sc.nextLine();
		int loopCounterInt = Integer.parseInt(loopCounter);
		forLoop(loopCounterInt);
		whileLoop(loopCounterInt);
		doLoop(loopCounterInt);
	}
	
	public void splitNumber() {
		System.out.println("Enter a 5-digit number:");
		Scanner sc = new Scanner(System.in);
		String loopCounter = sc.nextLine();	
		int z = 0;
		int t = 0;
		for(int x = 0; x < 5; x++) {
			System.out.println(loopCounter.charAt(x));
			z = z + loopCounter.charAt(x)-'0';
			t = t + Character.getNumericValue(loopCounter.charAt(x));
			// Add each individual number to the other
			// to get a total 
			// eg. 56789 = 5+6+7+8+9 = 35
			// Hint: Integer.parseInt(loopCounter);
		}
		System.out.println("z= " +z);
		System.out.println("t= " +t);		
	}
	
	
	public void doMath() {
		System.out.println("Enter a Farenheit degree:");
		Scanner sc = new Scanner(System.in);
		String degree1 = sc.nextLine();	
		// Calculate the C of degree1
		// e.g. 32F = 0C
		
		System.out.println("Enter a Celsius degree:");
		String degree2 = sc.nextLine();	
		// Calculate the F of degree2
		// e.g. 0C = 32F
	}

}
