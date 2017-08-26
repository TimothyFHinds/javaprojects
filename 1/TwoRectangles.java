//Timothy Hinds

import java.util.Scanner;

public class TwoRectangles 
{
	public static void main(String[] args)
	{
		//variables
		Scanner input = new Scanner(System.in);
		double x1, y1, width1, height1, x2, y2, width2, height2, xDistance, yDistance;
		
		//input
		System.out.println("Enter the x-coordinate, the y-coordinate, the width, and height of the FIRST rectangle. In order please.");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		width1 = input.nextDouble();
		height1 = input.nextDouble();
		
		System.out.println("Enter the x-coordinate, the y-coordinate, the width, and height of the SECOND rectangle. In order please.");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		width2 = input.nextDouble();
		height2 = input.nextDouble();
		
		//distance conditions
		if(x1>x2)
		{
			xDistance = x1-x2;
		} else
		{
			xDistance = x2-x1;
		}
		if(y1>y2)
		{
			yDistance = y1-y2;
		} else
		{
			yDistance = y2-y1;
		}
			
		//returning conditions
		if (xDistance <= (width1-width2)/2 && yDistance <= (height1 - height2) / 2)
		{
			System.out.println("Rectangle 2 is inside Rectangle 1");
		} else if(xDistance <= (width1+width2)/2 && yDistance <= (height1 + height2)/2)
		{
			System.out.println("Rectangle 2 overlaps Rectangle 1");
		} else
		{
			System.out.println("Rectangle 2 does not overlap Rectangle 1");
			
		}
	}
}
