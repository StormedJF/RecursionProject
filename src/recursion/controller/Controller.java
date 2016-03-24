package recursion.controller;
import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;

public class Controller 
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	
	Controller()
	{
		baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public String doFibonacci(String input)
	{
		calculatedValue = " The Fibonacci sequence at " + input + " is: " + Double.toString(mathTool.fibonacci(Double.parseDouble(input)));
		return calculatedValue;
	}

	public String doFactorial(String input)
	{
		calculatedValue = " The factorial sequence at " + input + " is: " + Double.toString(mathTool.factorial(Double.parseDouble(input)));
		return calculatedValue;
	}
}
