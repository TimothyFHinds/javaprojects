//Timothy Hinds
import java.util.Scanner;

public class Digits 
{
	public static void main(String[] args)
	{
		
		int number, sum, digit1, digit2, digit3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		number = input.nextInt();
		
		
		digit1 = number % 10; //ones place
		number = number / 10;
	
		digit2 = number % 10; //tens place
		number = number / 10;
		
		digit3 = number % 10; //hundreds place
		number = number / 10;
		
		sum = digit1 + digit2 + digit3; 
		
		
		
		System.out.print("The sum of the digits is " + sum + ".");
		
		
		
		
		
		
		
		
	}
}
