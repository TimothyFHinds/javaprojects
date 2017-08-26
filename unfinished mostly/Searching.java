//example 5 and 6 in array module
public class Searching
{
	public static void main(String[] args) 
	{
		//variables
		int[] numbers = new int[100];
		int searchIndex, searchValue;
		
		//fill numbers with random values
		fillRandom(numbers);
		searchValue = (int)(Math.random() * 100);
		
		//display numbers
		display(numbers);
		
		//call linear search
		//sort them first
		
		selectionSort(numbers);
		display(numbers);
		
		searchIndex = linearSearch(numbers, searchValue);
		if(searchIndex != -1)
			System.out.println("The value of " + searchValue + " is at index " +searchIndex);
		else
			System.out.println("The value of " + searchValue + " is not in the array");
		
		//call binary search
		searchIndex = binarySearch(numbers, searchValue);
		if(searchIndex != -1)
			System.out.println("The value of " + searchValue + " is at index " + searchIndex);
		else
			System.out.println("The value of " + searchIndex + " is not in the array");
		
		
		
		
		
		
		
	}

	private static void selectionSort(int[] numbers) 
	
	{
		int minIndex;
		for(int i=0; i<numbers.length; i++)
		{
			minIndex = findMin(numbers, i);
			swap(numbers, i, minIndex);
			
		}
		
		// TODO Auto-generated method stub
		
	}

	private static int findMin(int[] numbers, int start) 
	{
		int minIndex = start;
		for(int i = start + 1; i<numbers.length; i++)
		{
			if(numbers[i] < numbers[minIndex])
			{
				minIndex = i;
			}
		}
		return minIndex;
	}

	private static void swap(int[] numbers, int i, int minIndex) 
	{
		// TODO Auto-generated method stub
		int temp = numbers[i];
		numbers[i] = numbers[minIndex];
		numbers[minIndex] = temp;
	}

	private static void display(int[] numbers) 
	{
		for(int i=0; i<numbers.length;i++)
		{
			if(i%10 == 0)
			System.out.println();
			
			System.out.print(numbers[i] + " ");
			
		}
		System.out.println();
		
	}

	
	
	
	private static int binarySearch(int[] numbers, int searchValue) 
	{
		int searchIndex = -1;
		int start = 0, end = numbers.length-1, mid;
		while(end >= start && searchIndex == -1)
		{
			mid = (end + start)/2;
			if(numbers[mid] <searchValue){
				start = mid + 1;
			} else if (numbers[mid] >searchValue){
				end = mid - 1;
			} else // Found it
				searchIndex = mid;
		}
		
		
		return searchIndex;
	}

	
	
	
	private static int linearSearch(int[] numbers, int searchValue) 
	{
		int searchIndex = -1;
		
		for(int i=0; i<numbers.length && searchIndex == -1; i++)
		{
			if(numbers[i] == searchValue)
			{
				searchIndex = i;
			}
			
			
		}
		return searchIndex;
	}

	
	
	
	
	
	private static void fillRandom(int[] numbers) 
	{
		for(int i=0; i<numbers.length;i++)
		{
			numbers[i] = (int)(Math.random() * 100);
		}
		
		
		
	}

}
