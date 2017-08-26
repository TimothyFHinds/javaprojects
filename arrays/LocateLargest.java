//Timothy Hinds
//locate the largest element, return the location of it in a 2d array

import java.util.Scanner;

public class LocateLargest 
{

	public static void main(String[] args) 
	{
		//scanner and get user input for the array
		//also creates an array of ints 'numbers' which will be the returned array of the two highest numbers
		//located inside of the matrix inputted by the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and column of the array:");
		int row = input.nextInt();
		int col = input.nextInt();
		int[] numbers;
		System.out.println("Enter the array:");
		double[][] matrix = new double[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				matrix[i][j] = input.nextDouble();
			}
		}
		
		numbers = locateLargest(matrix);
		System.out.println("The location of the largest element is at (" + numbers[0] + ", " + numbers[1] + ")");
		
		

	}

	
	
	public static int[] locateLargest(double[][] a)
	{
		double max = 0;
		int[] numbers = new int[2];
		
		
		//loops through the matrix array when called in the main method
		//checks every value, everytime one is bigger than the current max it is then changed to max
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j] > max) 
				{
					max = a[i][j];
					numbers[0] = i;
					numbers[1] = j;
				}
				
			}
		}
		
		return numbers;
		
	}
}
