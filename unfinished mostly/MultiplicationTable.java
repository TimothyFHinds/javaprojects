
public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		//Variables
		
		//Display a 1...9 by 1....9 multiplication table
		
		for(int i=1; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				//inner loop is row by row
				System.out.print(i*j + " ");
			}
			System.out.println();
			
		}
		
		
	}
}
