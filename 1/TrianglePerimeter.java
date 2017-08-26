//Timothy Hinds

import java.util.Scanner;

public class TrianglePerimeter 
{
	public static void main(String[] args)
	{
		//Variables
		Scanner input = new Scanner(System.in);
		double base, height, hyp, perim;
		
		//get the input
		System.out.println("Enter the length of the base: ");
		base = input.nextDouble();
		System.out.println("Enter the length of the height: ");
		height = input.nextDouble();
		System.out.println("Enter the length of the hypotonuse: ");
		hyp = input.nextDouble();
		
		//Calculate perimeter
		perim = base + height + hyp;
		
		//conditions
		if((perim > 0) && (base+height > hyp) && (base+hyp > height) && (height+hyp > base)) {
			
			//print perimeter if conditions are met
			System.out.println("The perimeter of the triangle is: " +perim);
		} else 
		{
			System.out.println("The input is invalid, try again.");
		}
		
	}
}
