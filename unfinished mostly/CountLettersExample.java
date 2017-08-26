
public class CountLettersExample 
{

	public static void main(String[] args) 
	{
		//create array of random characters then display it with this function, count letters of each individual characters
		//then display occurences of each letter
		
		
		//variables
		char[] chars = createArray();
		int[] counts;
		
		//Display the array
		System.out.println("The lower case letters are:");
		displayArray(chars);
		
		
		//count the occurences
		counts = countLetters(chars);
		
		//Display counts
		System.out.println();
		System.out.println("The occurences of each letter are: ");
		displayCounts(counts);
		
		
	}

	private static void displayCounts(int[] counts) 
	{
		//display counts, 10 per line
		
		
		for(int i=0; i<counts.length; i++)
		{
			if(i%10 == 0)
			{
				System.out.println();
			}
			char x = (char)(i + 'a');
			System.out.print(x + ", " + counts[i] + " : ");
			
			
			
		}
		
		
		
	}

	
	
	
	
	private static int[] countLetters(char[] chars) 
	{
		//create an array for all 26 characters
		//count the occurences for each letter
		//for all items in chars we want to increase count for each corresponding character
		//0 = a, 1=b
		
		int[] counts = new int[26];
		
		for(int i=0; i<chars.length; i++)
		{
			counts[chars[i] - 'a']++;
		}
		return counts;
	}

	
	
	
	
	
	
	
	private static void displayArray(char[] chars) 
	{
		//display letters, 20 per line
		//checks to see if needs to print a new line first, then prints characters
		
		for(int i = 0; i<chars.length; i++)
		{
			if(i % 20 == 0) 
			{
				System.out.println();
				
			}
			
			System.out.print(chars[i] + " ");
		}
		
	}

	
	
	
	
	
	
	
	private static char[] createArray() 
	{
		
		//create an array of 100 characters
		//create lowercase letters randomly
		//lowercases letters stored sequentially
		
		
		char[] chars = new char[100];
		 
		for(int i=0; i<chars.length; i++)
		{
			chars[i] = (char) ((Math.random() * ('z' - 'a')) + 'a');	
		}
		
		return chars;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
