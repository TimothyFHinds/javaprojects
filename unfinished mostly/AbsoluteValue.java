import java.util.Scanner;
public class AbsoluteValue {
	public static void main(String[] args) {
		//Variables
		double number;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for double
		System.out.println("Enter your number: ");
		number = input.nextDouble();
		
		//if the number is negative, make it positive
		if(number<0) {
			number = number * -1;
			}
		//Display result
		System.out.println("The absolute value of your number is " +number);
		
		}
		
		
	}


