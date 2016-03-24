package recursion.model;

public class Timer
{

	private double startTime;
	private double endTime;
	
	public Timer()
	{
		endTime = 0;
		startTime = 0;
	}
	public void startTimer()
	{
		startTime = System.nanoTime();
	}
	
	public void stopTimer()
	{
		endTime = System.nanoTime();
	}
	
	public void resetTimer()
	{
		endTime = 0;
		startTime = 0;
	}
	
	public double getTime()
	{
		return endTime-startTime;
	}
}
