import java.util.Scanner;

public class GradeCalculator 
{
	public static void main(String[] args)
	{
		int grade;
		Scanner input = new Scanner(System.in);
		char letter;
		
		//Ask for a grade
		System.out.println("Enter your grade out of 100 and as a whole number");
		grade = input.nextInt();
		
		//Calculate grade and display
		/* if (grade >= 90) 
		{
			System.out.println("You got an A!");
		} else if (grade >= 80) 
		{
			System.out.println("You got a B!");
		} else if (grade >= 70)
		{
			System.out.println("You got a C.");
		} else if (grade >= 60)
		{
			System.out.println("You got a D");
		} else 
		{
			System.out.println("You got an F");
		} */
		
		switch (grade/10) {
		case 10:
		case 9:
			letter = 'A';
			break;
		case 8:
			letter = 'B';
			break;
		case 7:
			letter = 'C';
			break;
		case 6:
			letter = 'D';
			break;
		default:
			letter = 'F';
			break;
		}
		System.out.println("Your grade was: " +letter);
		
		
		
	}
	
	
}
