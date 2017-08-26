//Timothy Hinds

import java.util.Scanner;

public class MergeSorted 
{

	public static void main(String[] args) 
	{
		//prompt the user to enter the numbers in the first and second arrays
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first list: ");
		
		//the loop is to fill the entire array with the numbers entered by the user
		int[] list1 = new int[input.nextInt()];
		for(int i=0; i<list1.length; i++)
		{
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter the second list: ");
		int[] list2 = new int[input.nextInt()];
		for(int i=0; i<list2.length; i++)
		{
			list2[i] = input.nextInt();
		}
		
		//now create a 3rd array merging the first two by calling the method to merge them together
		int[] list3 = merge(list1, list2);
		
		//prints the 2 merged lists: list3 is printed
		System.out.println("The merged list is: " );
		for(int i=0; i<list3.length; i++)
		{
			System.out.print(list3[i] + " ");
		}

	}
	
	
	public static int[] merge(int[] list1, int[] list2)
	{
		//creates the list to return, the lists size is list1.length + list2.length
		int[] list3 = new int[list1.length + list2.length];
		
		//the loop uses temp variables x and y to sort through the lists
		//and organize them into list 3 in increasing order
		int x = 0, y = 0;
		for(int i=0; i<list3.length; i++)
		{
			if(y < list2.length&&list1[x] > list2[y])
			{
				list3[i] = list2[y];
				y++;
			} else if (x < list1.length) {
				list3[i] = list1[x];
				x++;
			}
		}
		return list3;
		
	}

}
