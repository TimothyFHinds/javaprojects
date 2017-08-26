//Timothy Hinds
public class PatternB 
{
	public static void main(String[] args) 
	{
		for(int i=6; i>0; i--) {
			//I made the first for loop start at 6 and count down since the numbers decended from 6 in the pattern
			
			for(int j =1; j<=i; j++) {
				//this loop starts at 1, then prints every number from 1 to "i"
				//so that once "i" is reached, it will start a new line, "i" will be
				//reduced by one, then it will repeat until j=i which will be 1=1 so the lines will stop
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}
}
