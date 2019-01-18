package edu.gcu.bootcamp.DayFour;

import edu.gcu.bootcamp.DayFourA.ImportPractice;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!");
        LoopPractice bob = new LoopPractice();
        bob.demoLoops();
        bob.splitNumber();
        bob.doMath();
    	show();
    	
    	ImportPractice mary = new ImportPractice();
    	mary.brownies();
    	
    	// Incorrect way to access to a static method
    	// Do NOT use the object name
    	mary.cupcakes();
    
    	// Correct way to access static method
    	// Use the CLASSNAME
    	ImportPractice.cupcakes();
    	
    	// Use the results of the cupcakes to print out
    	// Use a loop to display the following...
    	// I ate 1 cupcakes
    	// I ate 2 cupcakes
    	// I ate 3 cupcakes
    	// ....
    	int numCupcakes = ImportPractice.cupcakes();
		for(int x = 0;x < numCupcakes; x++) {
			System.out.println("I ate " + x + " cupcakes!");
		}
    }
    
    public static void show() {
    	int x = 6;
    	System.out.println(x++);    // 7
    	System.out.println(x--);     // 6
    	System.out.println(++x);     //7
    	System.out.println(--x);   //6
    	System.out.println(x);
    }
}
