package Clocks;

public class Counter {
	
	private int count, base;
	
	public Counter(int baseVal)
	{
		base = baseVal;
		count = 0;
	}
	
	public void increment()
	{
		count++;
		if(count==base)
		{
			reset();
		}
	}
	
	private void reset()
	{
		count = 0;
	}
	
	public int ShowCount()
	{
		return count;
		
	}

}
