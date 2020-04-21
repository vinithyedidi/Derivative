package derivative;

//Author: Vinith Yedidi
//Date: 4/20/2020
//Current version: 1.0.0

import java.text.*;
import java.util.*;

public class InputOutput {

	
	
	/**
	 * Determines which class the input String belongs to. If indeterminable, it throws an InvalidInputException.
	 * @param str
	 * @return type, represents the type found by this method.
	 */
	
	public static String findType(String input) throws Exception {
		String type = "";
		
		/*
		 * Determines if the input is an empty String.
		 * If it is an empty String, it throws an EmptyInputException.
		 * Else, it moves on the other statements in this method.
		 * 
		 */
		
		if (input.length() == 0 || input == null) {
			throw Function.EmptyInputException;
		}
		
		// Removes every space in the String input and removes all capitals.
		
		input = input.trim().toLowerCase();
		for (int index = 0; index < input.length(); index ++) {
			if (input.charAt(index) == ' ') {
				input = input.substring(0, index) + input.substring(index + 1);
			}
		}
		
		// Determines if the function is a Polynomial or a Monomial by finding the position of '+' or '-'.
		
		if (input.indexOf('+') != -1 || ((input.indexOf('-') != -1 && input.indexOf('x') != -1 ) && input.indexOf('-') > input.indexOf('x'))) {
			type = "Polynomial";
		} else {
			type = "Monomial";
		}
		
		/* 
		 * Broaden parameters as needed for expansion of this program.
		 */
	
		return type;
		
	}
	
	
	
	/**
	 * Main method to package derivative.
	 * Runs every single class.
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		
		// Creates Scanner
		try (Scanner scan = new Scanner(System.in)) {
			
			// Prompts user input.
			System.out.println("\n Please enter function with 'x' as the variable and enter the x value:\n" +
							   " f(x) = \n" +
							   " x = ");
			
			// These are the two inputs: the function and the X value.
			String function = scan.nextLine();
			double xValue = Double.MIN_VALUE;
			try {
				xValue = scan.nextDouble(); 
			} catch (Exception e) {
				Function.InvalidXValueException.printStackTrace();
				System.exit(0);
			}

			Double derivative = null;

			// Finds the type of the object and based on that, computes the derivative. The Object obj is just a placeholder to execute a non-static method in the Main[] method.
			switch (findType(function)) {
				case ("Monomial"):
					Monomial obj1 = new Monomial();	
					derivative = obj1.computeDerivative(function, xValue);
					break;
				case ("Polynomial"):
					Polynomial obj2 = new Polynomial();
					derivative = obj2.computeDerivative(function, xValue);
					break;
			}
			
			// If after the switch statement the derivative wasn't found. It throws an ErrorOccurred Exception. Otherwise, it prints out the formatted derivative.
			if (derivative == null) {
				throw Function.ErrorOccurredException;
			} else {
				DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
				df.setMaximumFractionDigits(340);
				System.out.println("The derivative of f(x) = " + function + " at x = " + df.format(xValue) + " is " + df.format(derivative) + ".");
				System.exit(0);
			}
		}
	}
}
