//Timothy Hinds
//sum elements column by column
//return the sum
import java.util.Scanner;

public class SumByColumn 
{

	public static void main(String[] args) 
	{
		//2d array and scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		double[][] m = new double[3][4];
		
		//user input creating the variables inside of the 2d array
		for(int row=0; row<m.length; row++)
		{
			for(int col=0; col<m[row].length; col++)
			{
				m[row][col] = input.nextDouble();
				
			}
		}
		
		
		//printing the sum of each column while calling the sumColumn method
		//loop starts at the first column then sums together the first column
		//loops to the last column (4th)
		for(int col=0; col<m[0].length; col++)
		{
			System.out.println("Sum of the elemts at column " + col + " is " + sumColumn(m, col));
		}
		
		
		
		input.close();
	}
	
	
	public static double sumColumn(double[][] m, int columnIndex)
	{
		//loops through summing together each number in the column
		double sum = 0;
		
		for(int row = 0; row<m.length; row++)
		{
			sum += m[row][columnIndex];
		}
		return sum;
		
	}
	
	

}
