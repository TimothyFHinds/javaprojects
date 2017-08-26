//Timothy Hinds
//a latin square is an n-by-n array filled with n different latin letters
//each occuring once in each row and once in each column

import java.util.Scanner;

public class LatinSquares 
{

	public static void main(String[] args) 
	{
		//scanner and n number of rows/columns input by user
		//then the user inputs the letters with spaces in between into the squares 2d array
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number n: ");
		int n = input.nextInt();
		char[][] squares = new char[n][n];
		
		System.out.println("Enter " + n + " rows of letters separated by spaces:");
		for(int row=0;row<squares.length;row++)
		{
			for(int col=0;col<squares[row].length;col++)
			{
				squares[row][col] = input.next().charAt(0);
			}
		}
		
		System.out.println(checkLatinSquare(squares));
		
		
		
	}

	private static boolean checkLatinSquare(char[][] squares) 
	{
		//loops through every index of the 2d array
		//calls a method isValid to check if the letters entered are correctly associated with the index
		//of rows and columns
		for(int row=0; row<squares.length; row++)
		{
			for(int col=0; col<squares[row].length;col++)
			{
				if(!isValid(squares[row][col], squares.length)) 
				{
					System.out.println("Invalid letters...");
					System.out.println("n = " + squares.length + " your letter range is " + 'A' + " - " + (char)('A' + squares.length -1));
					return false;
				}
				
			}
			
		}
		
		//this loop is checking to see if there are unique letters on every row
		
		for(int row=0;row<squares.length;row++)
		{
			if(!validRow(squares, row)) return false;
		}
		
		
		//and then this one will be checking to see if every column has unique letters
		
		for(int col=0; col<squares[0].length;col++)
		{
			if(!columnValid(squares, col)) return false;
		}
		
		
		return true;
	}

	
	
	
	
	private static boolean columnValid(char[][] squares, int col) 
	{
		boolean[] used = new boolean[squares.length];
		
		for(int x=0;x<squares.length;x++)
		{
			int index = squares[x][col] - 'A';
			
			if(used[index])
			{
				return false;
			} else {
				used[index] = true;
			}
		}
		return true;
	}
	
	
	
	
	

	private static boolean validRow(char[][] squares, int row) 
	{
		boolean[] used = new boolean[squares.length];
		
		for(int i=0; i< squares[row].length; i++)
		{
			int index = squares[row][i] - 'A';
			
			if(used[index])
			{
				return false;
			} else {
				used[index] = true;
			}
		}
			return true;
	}

	
	
	
	
	
	private static boolean isValid(char c, int length) 
	{
		length--;
		return (c >= 'A' && c <= 'A' + length);
		
	}
	
	
	

}
