package recursion.model;

public class IterativeTool 
{
	public double fibonaciTool(int position)
	{
		double number = 0, pastNumber = 1, nextNumber = 1;
		if(position < 0)
		{
			number = Double.MIN_VALUE;
		}
		else
		{
			for(int i = 0; i < position; i++)
			{
				number = pastNumber;
				pastNumber = nextNumber;
				nextNumber = number + pastNumber;
			}
		}
		return number;
	}
	
	public double factorialTOol(int position)
	{
		double number = 0, nextNumber =1;
		if(position < 0)
		{
			number = Double.MIN_VALUE;
		}
		else
		{
			for(int iter = 0; iter < position; iter ++)
			{
				if(iter == 0)
				{
					number = 1;
				}
				else
				{
					number = number*iter;
				}
			}
		}
		return number;
	}
}
