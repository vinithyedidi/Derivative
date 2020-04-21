package derivative;

// Author: Vinith Yedidi
// Date: 4/20/2020
//Current version: 1.0.0

public abstract class Function {
	
	abstract double computeDerivative(String str, double xValue) throws Exception;
	
	abstract Function extractArgument(String str);
	abstract String determineConstructor(String str) throws Exception;
	
	abstract boolean seeIfDifferentiable(Function function, double xValue) throws Exception;
	abstract Double findY(Function function, double xValue);
	abstract Double leftLimit(Function function, double xValue);
	abstract Double rightLimit(Function function, double xValue);
	
	abstract Double calculator(Function function, double xValue);
	
	public static final Exception EmptyInputException = new Exception("EmptyInputException");
	public static final Exception InvalidInputException = new Exception("InvalidInputException");
	public static final Exception NoYValueException = new Exception("This function is not differentiable. The inputed X value doesn't have a corrensponding Y value.");
	public static final Exception NotDiffrentiableException = new Exception("This function is not differentiable. The left limit doesn't equal the right limit.");
	public static final Exception ErrorOccurredException = new Exception("An error occurred. Please try again.");
	public static final Exception TooLargeNumberException = new Exception("The numbers you inputed were too large. Please try again.");
	public static final Exception InvalidXValueException = new Exception ("Your X value was invalid. Please try again.");
	
}
