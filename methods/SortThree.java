//Timothy Hinds
import java.util.Scanner;

public class SortThree 
{

	
	public static void displaySortedNumber(double num1, double num2, double num3)
	{
		//check to see if a number is bigger than preceding
		//create a temp double to hold the value of the number being swapped
		//swap numbers, then check the next case
		//as an example in the comments ill test as if num1=3, num2=2, num3=1
		//to follow with what the numbers change to
		if(num1 > num2)
		{
			double temp = num2;
			num2 = num1;
			num1 = temp;
			//num1= 2, num2=3
		}
		if(num2 > num3)
		{
			double temp = num3;
			num3 = num2;
			num2 = temp;
			//num3=3, num2=1
		}
		if(num1 > num2)
		{
			double temp = num2;
			num2 = num1;
			num1 = temp;
			// num1 =1 , num2 = 2
		}
		
		System.out.print("The increasing order of your three numbers is: " +num1 + " " + num2 + " " + num3);
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x, y, z;
		//ask user to input 3 numbers
		System.out.println("Please enter your first number: ");
		x = input.nextDouble();
		
		System.out.println("Please enter your second number: ");
		y = input.nextDouble();
		
		System.out.println("Please enter your third number: ");
		z = input.nextDouble();
		
		displaySortedNumber(x, y, z);
		//call the method with the three variables entered
		 
		
		
		
		
	}

}
