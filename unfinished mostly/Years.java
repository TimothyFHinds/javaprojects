//Timothy Hinds
import java.util.Scanner;

public class Years 
{
	public static void main(String[] args)
	{
		
		int minutes, years, days, hours, daysLeft;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		minutes = input.nextInt();
		
		hours = minutes / 60;
		
		days = hours / 24;
		
		years = days / 365;
		
		daysLeft = days % 365;
		
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + daysLeft + " days.");
		
		
		
		
	}
}
