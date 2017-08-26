
public class OverloadingExample 
{
	public static int max(int x, int y) 
	{
		System.out.println("First max method is called.");
		int maxValue = (x > y) ? x : y;
		return maxValue;

	}
	public static double max(double x, double y) 
	{
		System.out.println("Second max method is called.");
		double maxValue = (x > y) ? x : y;
		return maxValue;

	}
	public static double max(double x, double y, double z) 
	{
		System.out.println("Third max method is called.");
		double maxValue = (x > y) ? x : y;
		maxValue = (maxValue > z) ? maxValue : z;
		return maxValue;

	}
	
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		double c = 2.5, d = 4.5;
		
		System.out.println("The max of " + a + " and " + b + " is " + max(a,b));
		System.out.println("The max of " + c + " and " + d + " is " + max(c,d));
		System.out.println("The max of " + a + " and " + b + " and " + c + " is " + max(a,b,c));
		
	}
	
	
}
