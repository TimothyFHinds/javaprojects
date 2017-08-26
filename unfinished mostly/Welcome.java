import java.util.Scanner;
public class Welcome {
	public static void main(String[] args) {
		
		
		/* int[][] t = new int[3][3];
		for(int i = 0; i < 3; i++)
			   for(int j = 0; j < 3; j++)
			      if(i == j)
			         t[i][j] = 1;
			      else
			         t[i][j] = 0;
		
		for(int row =0; row<t.length; row++)
		{
			for(int col=0; col<t[1].length;col++)
			{
				System.out.print("|" + t[row][col]);
			}
			System.out.println();
			
			*/
		
		double[] myList = {2, 3, 9, 4, 1, 100, 30};

		double min = myList[0];
		
		int minIndex = 0;
		for(int i=1; i<myList.length; i++)
		{
			if(myList[i] < min)
			{
				min = myList[i];
				minIndex = i;
			}
		}
		
		System.out.print(min);
		
		
		}
}

