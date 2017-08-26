//Timothy Hinds

import java.util.Scanner;

public class Discriminant 
{
	public static void main(String[] args)
	{
		//variables
		double a=0, b=0, c=0, root1=0, root2=0, disc=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your value for a: ");
		a = input.nextDouble();
		
		System.out.print("Now, enter your value for b");
		b = input.nextDouble();
		
		System.out.println("Finally, enter your value for c");
		c = input.nextDouble();
		
		//calculate quadratic roots and discriminant
		root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		disc = b*b - 4*a*c;
		
		//conditional
		if(disc > 0) {
			System.out.println("The equation has two roots: " +root1 +" and " +root2);
		} else if (disc == 0) {
			System.out.println("The equation has one root:" +root2);
		} else
			System.out.println("The equation has no roots");
	}
}
