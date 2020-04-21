package derivative;

//Author: Vinith Yedidi
//Date: 4/20/2020
//Current version: 1.0.0

public class Information {

	// This class doesn't contain any code. Instead, it contains metadata necessary to understand how this package works.
	
	/* Overall Information:
	 * 
	 *  - The function of this class is to find and output the mathematical derivative of the inputted function at the inputted X value.
	 *  - For version 1.0.0, Monomials (either ax^n, ax, or c) and Polynomials (ax^n + bx^(n-1) + ... + c) are supported. 
	 *  - While it computes the derivatives of these functions successfully, this program operates more precisely with smaller, integer numbers.
	 *  - The Polynomial class's methods use methods from the Monomial class since a Polynomial is essentially a set of Monomials added together.
	 */
	
	/* Structure:
	 * 
	 * There is one abstract class called "Function" which contains abstract methods and all of the Exceptions needed to run this program.
	 * Underneath "Function" are the two types of Functions supported by this program: "Monomial" and "Polynomial". Both of these classes 
	 * contained the inherited methods that run the program for their type. Finally, there is the "InputOutput" class that contains the Main[]
	 * method that runs this program and provides user input and output.
	 */
	
	/* How it works:
	 * 
	 * The user first inputs the function and the X value they want the derivative of. The findType method determines if it's a Monomial or
	 * a Polynomial. Then, depending on its type, the program will run the appropriate computeDerivative() method, which uses all the other 
	 * methods in the class. Finally, the InputOutput class will take this derivative result and output it to the user.
	 */
	
}
