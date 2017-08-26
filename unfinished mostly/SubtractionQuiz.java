import java.util.Scanner;

public class SubtractionQuiz 
{
	public static void main(String[] args)
	{
		//variables
		int number1, number2, temp, answer, correct = 0;
		Scanner input = new Scanner(System.in);
		
		for (int count = 0; count<10; count++) 
		{
				
			//Get two random single-digit integers
			number1 = (int)(Math.random() * 10);
			number2 = (int)(Math.random() * 10);
			
			//Swap number1 with number2 if number1 < number2
			if(number1 < number2) 
			{
				temp = number1;
				number1 = number2;
				number2 = temp;
			}
			//Prompt and get answer from user
			System.out.print("What is " + number1 + " - " + number2 + "?");
			answer = input.nextInt();
			
			//Check if correct and display appropraite message
			if(answer == number1 - number2)
			{
				System.out.println("You are correct!");
				correct++;
				
			} else {
				System.out.println("You are wrong.");
			}
			
		}
		System.out.println("You got: " +correct +" questions correct out of 10!");
		
	}
	
}
