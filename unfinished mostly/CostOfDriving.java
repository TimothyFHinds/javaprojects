//Timothy Hinds
import java.util.Scanner;

public class CostOfDriving 
{
	public static void main(String[] args)
	{

		
		double distance, mpg, ppg, cost;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon");
		mpg = input.nextDouble();
		
		System.out.print("Enter price per gallon");
		ppg = input.nextDouble();
		
		cost = distance / mpg;
		cost = cost * ppg;
		
		System.out.println("The cost of driving is $" + (int)(cost*100) / 100.00);
		
		
		
		
		
	}
}
