package recursion.model;

public class RecursionTool 
{
	public double fibonacci(double position)
	{
		if (position < 0)
		{
			return Double.MIN_VALUE;
		}
		else if(position == 1 || position == 0)
		{
			return 1;
		}
		else
		{
			return fibonacci(position -1) + fibonacci(position - 2);
		}
	}
		public double factorial(double position)
		{
			if(position < 0)
			{
				return Double.MIN_VALUE;
			}
			else if(position == 0)
			{
				return 1;
			}
			else
			{
				return position * factorial(position -1);
			}
		}
}
