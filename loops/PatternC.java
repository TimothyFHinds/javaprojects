//Timothy Hinds

public class PatternC 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 6; i++) {
			   //made my first loop and two nested loops inside
			for (int j = 1; j <= (6 - i); j++) {
				//this loop prints the necessary spacing so the numbers align on the right
			System.out.print("  ");
			}
			
			for (int j = i; j>= 1; j--) {
				//this loop was tricky, but it starts at i, and counts down until its equal to 1
				//which means that it will print numbers counting down from what i is equal to
				//until i is looped to become itself then it will stop the loop 
			System.out.print(j + " ");
			}
			System.out.println();
		 
		}
	}
}
