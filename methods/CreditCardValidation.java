//Timothy Hinds
import java.util.Scanner;

public class CreditCardValidation 
{
	
	public static void main(String[] args) 
	{
		//asks the user for a number, it calls the method
		//isValid to check if the number is a valid Credit Card number
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		long num = input.nextLong();
		
		if(isValid(num)) 
		{
			System.out.print(num + " is valid.");
		} else {
			System.out.print(num + " is not valid.");
		}
	}
	
	
	
	// return true if the card number is valid
	public static boolean isValid(long number)
	{
		//checks to see if the first number of the Credit Card is from Visa,
		//Mastercard, Amex, or Discover
		int first = (int) getPrefix(number, 1);
		if(first !=4 && first !=5 && first != 3 && first !=6)
		{
			return false;
		}
		
		
		//if the first digit is 3 (for AMEX cards) it then checks to see if the first and second digit are 37
		if(first==3)
		{
			int second = (int) getPrefix(number, 2);
			if(second != 37)
			{
				return false;
			}
		}
		//checks to see if the sum of the digits from the sumOfOddPlace and 
		//sumOfDoubleEvenPlace are divisible by 10
		if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0)
		{
			return false;
		}
		//once all of the conditions are checked it returns
		return true;
	}
	
	
	
	
	//get the result from step 2
	public static int sumOfDoubleEvenPlace(long number)
	{
		//Calls the getSize method so that for loop
		//stays in the interval of the credit card number
		int x = getSize(number);
		int sum = 0;
		
		for(int i = 2; i <=x; i+=2)
		{
			//this integer 'digit' is the digit  at the index 'i' of the credit card number
			//sum adds the digit at the index and multiplies the digit by 2 first.
			int digit = (int) (((number / Math.pow(10,  i - 1))) % 10);
			sum += getDigit(2 * digit);
		}
		return sum;
		
	}
	
	
	
	
	//return this number if it is a single digit, otherwise return the sum of the two digits
	public static int getDigit(int number)
	{
		//this checks when finding the sumOfDoubleEvenPlace
		//to see if the number is two digits, or one
		//if it is one digit it returns it
		//else, if its two digits it returns the first one plus the second one
		int first = number / 10;
		int second = number % 10;
		
		if(first == 0)
		{
			return number;
		} else {
			return first + second;
		}
	}
	
	
	//return sum of odd place digits in number
	public static int sumOfOddPlace(long number)
	{
		//this calls the getSize method to use as the index of the credit card number
		int x = getSize(number);
		int sum = 0;
		
		for(int i=1; i<=x; i+=2)
		{
			//digit is calling from the index of the number
			//then adds the odd numbers to the sum
			int digit = (int) (((number / Math.pow(10,  i - 1))) % 10);
			sum += digit;
		}
		return sum;
	}
	
	
	//return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d)
	{
		//this checks the prefix of the credit card number to match them
		if(getPrefix(number, getSize(d)) == d)
		{
			return true;
		} return false;
	}
	
	
	//returns the number of digits in variable d
	public static int getSize(long d)
	{
		//this while loop is to add up the number of digits in the credit card number
		int digits = 1;
		while((d = d/10) != 0)
		{
			digits++;
		}
		return digits;
	}
	
	
	//return the first k number of digits from number. if the number of digits in number is less than k, return number
	public static long getPrefix(long number, int k)
	{
		//this checks and returns the prefix number in the credit card
		int digits = getSize(number);
		return number / (long)(Math.pow(10.0,  (double) (digits - k)));
	}
	
	

}
