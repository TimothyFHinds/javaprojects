import java.util.Scanner;

//Timothy Hinds


public class BubbleSort 
{

	public static void main(String[] args) 
	{
		//variables
		Scanner input = new Scanner(System.in);
		int[] numberSet = new int[10];
		
		//User inputs 10 numbers and it loops through the array putting the numbers into the numberSet array
		System.out.print("Enter ten numbers: ");
		for(int i=0; i<numberSet.length; i++) 
		{
			numberSet[i] = input.nextInt();
		}
		//executes the method which "bubblesorts" the numbers in the array
		bubbleSort(numberSet);
		
		//returns each number looping through the index of the array
		System.out.println("The array after the sort is: ");
		for(int i=0; i<numberSet.length; i++)
		{
			System.out.println(numberSet[i]);
		}		
	}
	
	
	public static void bubbleSort(int[] array)
	{
		//make this variable for ease of use when looping through
		int x = array.length -1;
		
		//it loops through the array to check if the number at index i and index i+1 are in order
		while(x != 0)
		{
			//i created my variable i outside of my loop so that it could be reached in the while loop
			//i used it in the while loop so that I can go through the index of the array starting from the end
			//then once the array index reaches 0 the while loop stops and the method is done
			int i;
			for(i=0; i<x; i++)
			{
				if(array[i] > array[i+1])
				{
					//if they are not in order the values are swapped
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			x = i-1;
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	

}
