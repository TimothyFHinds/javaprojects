import java.util.Scanner;

public class SentinelValue 
{
	public static void main(String[] args)
	{
		//Variables
		Scanner input = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		
		
		
		//Loop until input is zero, add to sum
		do
		{
			System.out.print("Enter a number, program will exit if you enter 0: ");
			number = input.nextInt();
			sum += number;
			
		} while (number !=0);
		
		//Display result
		System.out.println("The total sum is " + sum);
		
		input.close();
		
		
	}
}
