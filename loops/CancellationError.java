//Timothy Hinds
public class CancellationError 
{
	public static void main(String[] args) 
	{
		
		//variables
		final int n = 50000;
		//final to make the loop stop when it reaches 50000
		double sumleft = 0, sumright = 0;
		//sumleft is from left to right, and vice versa
		
		for(int i=1; i<=n; i++)
		{
			sumleft = sumleft + 1.0/i;
			//adds the series 1/1 + 1/2 + 1/3 + .... to 1/50000
		
			sumright = sumright + 1.0/(n-i+1);
			//adds the series starting from the end, (50000 - 1 + 1) is 1/50000
			//the next one it would add would be 1/ (50000 - 2 + 1) which is 1/49999
			
		}
		
		System.out.println("The summation from left to right is: " +sumleft);
		System.out.println("The summation from right to left is: " +sumright);
			
			
		}
		
		
		
	}
