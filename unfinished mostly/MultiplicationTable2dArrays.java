
public class MultiplicationTable2dArrays 
{

	public static void main(String[] args) 
	{
		//variables 
		int[] [] table = new int[10][10];
		
		
		//calculate the values
		for(int i=0; i<table.length; i++)
		{
			for(int j=0; j<table[i].length; j++)
			{
				table[i][j] = (i + 1) * (j +1);
			}
		}
		
		//display the table
		for(int i=0; i<table.length; i++)
		{
			for(int j=0; j<table[i].length; j++)
			{
				System.out.print(table[i][j] + " " );
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
