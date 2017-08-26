//Timothy Hinds

import java.util.Scanner;

public class Distinct 
{

	public static void main(String[] args) 
	{
		//create variables
		Scanner input = new Scanner(System.in);
		int[] numberSet = new int[10]; 
		int count = 0;  //the number of distinct variables
		
		System.out.print("Enter ten numbers: ");
		
		//loop that first loops to enter ten numbers from the user
		//it then goes through the next loop to check if its a distinct number
		//and it removes any distinct numbers from the array
		for(int i=0; i<10; i++)
		{
			int x = input.nextInt();
			boolean distinct = true;
			
			for(int j=0; j<count; j++)
			{
				if(x == numberSet[j])
				{
					distinct = false;
					break;
				}
			}
			
			if(distinct) numberSet[count++] = x;
			
		}
		//returns the number of distinct numbers which is count
		//and then loops through the numberSet on the index of count since that is how many distinct numbers there are
		System.out.println("The number of distinct numbers is " + count);
		System.out.println("The distinct numbers are: ");
		for(int i=0; i<count; i++)
			System.out.print(numberSet[i] + " ");
		
	}

}
