//Timothy Hinds
import java.util.Scanner;

public class FutureInvestment 
{
	public static void main(String[] args)
	{
		
		
		double interestRate, investAmount, value;
		int years;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		investAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		interestRate = input.nextDouble();
		interestRate = interestRate / 12;
		
		System.out.print("Enter number of years: ");
		years = input.nextInt();
		
		
		value = investAmount * Math.pow((1 + interestRate / 100), (years * 12));
		
	
		System.out.println("Accumulated value is $" + (int)(value*100) / 100.0 + ".");
		
		
		
		
		
		
	}
	
}
