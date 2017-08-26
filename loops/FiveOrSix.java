//Timothy Hinds
public class FiveOrSix 
{
	public static void main(String[] args) 
	{
		//count variable for each line. can only have 10 numbers in each line
		int count = 0;
		
		for(int i=1; i<=200; i++) {
			if(i%5 == 0 ^ i%6 ==0) {
					//I used the exclusive for "^" because if you use or you get numbers that are both divisible by 5 and 6.
					//I had the problem using or, and when i looked at my notes ^ was for cases when the boolean is
					//only true if it is one or the other. While || is true if both are divisible.
					System.out.print(i + " ");
					count++;
					
					if(count==10) {
						System.out.println();
						count = 0;
						//this resets the line once count is 10, it makes a new line
				}
			}	
		}
	}
}
