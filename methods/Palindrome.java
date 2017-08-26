//Timothy Hinds
import java.util.Scanner;

public class Palindrome 
{
	
	public static int reverse(int number)
	{
		int reverse = 0;
		int digit;
		//create variables, reverse is the number that is return reversed
		while(number!=0)
		{
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
			//modulos by 10 until number = 0
			//goes by tens place, if its 123, digit will equal 3 first, and so on for every digit place.
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number)
	{
		return (number == reverse(number));
		//checks to see if the number is equal to the reverse of the number
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x = 0;
		System.out.println("Enter a number that will be reversed to test if it is a Palindrome:");
		x = input.nextInt();

		if(isPalindrome(x)) 
		{
			System.out.print(x + " is a palindrome");
		} else {
			System.out.print(x + " is not a palindrome");
		}
		
		

	}

}
