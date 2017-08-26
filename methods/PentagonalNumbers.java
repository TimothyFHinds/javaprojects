//Timothy Hinds

public class PentagonalNumbers 
{
	
	
	public static int getPentagonalNumber(int n)
	{
		return n * (3 * n - 1) / 2;
		//using the formula in the book to get the pentagon number
	}
	

	
	public static void main(String[] args) 
	{
		//count variable for 10 numbers per line
		int count = 0;
		//looping through the first 100 pentagon numbers
		for(int i = 1; i <=100; i++)
		{
			count++;
			System.out.print(getPentagonalNumber(i) + " ");
			//calling the method to get the pentagon number for the i number between 1 and 100.
			
			if(count==10)
			{
				System.out.println();
				count = 0;
				//making a new line every ten numbers printed
			}
		}
	}
}
