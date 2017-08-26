//Timothy Hinds
import java.util.Scanner;

public class Grading 
{

	public static void main(String[] args) 
	{
		
		//create the variables
		int bestScore = 0;
		char grade;
		Scanner input = new Scanner(System.in);

		//prompt user to enter number of students
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		
		//create the array with the size being the number of students entered by the user
		int[] score = new int[n];
		
		System.out.print("Enter " + n + " score:");
		
		//make a loop that puts the grade scores into the score array
		//inside the loop make it so that it makes our bestScore = the best score entered 
		for(int i=0; i<score.length; i++)
		{
			score[i] = input.nextInt();
			{
				if(bestScore < score[i]) 
				{
					bestScore = score[i];
				}
			}
		}
		
		//loop that associates the scores with a letter grade then prints the students scores and grades
		for(int i=0; i<score.length; i++) 
		{
			if(score[i] >= bestScore -10)
				grade = 'A';
			else if(score[i] >= bestScore -20)
				grade = 'B';
			else if(score[i] >= bestScore -30)
				grade = 'C';
			else if(score[i] >= bestScore -40)
				grade = 'D';
			else 
				grade = 'F';
			
			System.out.println("Student " + i +" score is " + score[i] + " and grade is " + grade);
		}
		
		input.close();
		

	}

}
