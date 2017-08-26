import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		//Variables
		int years;
		Scanner input = new Scanner(System.in);
		
		//Prompt user and obtain year
		System.out.print("Enter a year: ");
		years = input.nextInt();
		
		//Check if its a leap year
		if (((years % 4 == 0) && (years % 100 != 0)) || (years % 400 == 0)) {
			//it is leaping
			System.out.println("This year is a leap year");
		} else {
				System.out.println("This year is not a leap year.");
			}
			
			
		}
		
		//Return yes or no statement
		
	}
