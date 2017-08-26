import java.util.*;

public class computeArea {
	
	public static void main(String[] args) {
		//Variables
		double radius, area;
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		
		
		//Prompt user to input radius
		System.out.print("Input the radius of the circle:  ");
		
		//Obtain Radius
		radius = input.nextInt();
		
		//Compute Area
		area = PI * radius * radius;
		
		//Print Results
		System.out.println("The area of a circle with radius" + radius + " is " + area);
		
	}
}
