//Timothy Hinds
public class PrimeNumbers 
{
	public static void main(String[] args)
	{
		//count variable for 8 numbers per line
		int count = 0;
		
		
		for(int i=2; i<1000; i++) {
			for(int j=2; j<=i; j++) {
				//checking if number can only be divided by itself
				
				//if it isnt divisible then it will print the prime number
				if(j==i)
				{
					System.out.print(i +" ");
					count++;
					if(count == 8) 
					{
						System.out.println();
						count = 0;
					}
				}
				
				if(i%j==0)
					//if its even then it skips the number
				{
					break;
				}
			}
		}
	}
}

