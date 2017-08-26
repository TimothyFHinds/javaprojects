//Timothy Hinds

import java.util.Scanner;

public class CompareCosts 
{
	public static void main(String[] args)
	{
		//variables
		Scanner input = new Scanner(System.in);
		double price1, price2, weight1, weight2, value1, value2;
		
		//input 1st item
		System.out.println("Enter the cost of the first item: ");
		price1 = input.nextDouble();
		System.out.println("Enter the weight of the first item: ");
		weight1 = input.nextDouble();
		
		//input 2nd item
		System.out.println("Enter the cost of the second item: ");
		price2 = input.nextDouble();
		System.out.println("Enter the weight of the second item: ");
		weight2 = input.nextDouble();		
		
		//Value of 1 and 2
		value1 = weight1/price1;
		value2 = weight2/price2;
		
		//conditional statements
		if((value1 > 0) && (value2 > 0))
		{
			if(value1 > value2)
			{
				System.out.println("Item 1 has a better price.");
			} else if (value1 < value2)
			{
				System.out.println("Item 2 has a better price.");
			} else if (value1 == value2)
			{
				System.out.println("The items prices are the same.");
			} 
		} 
		
	}
}
