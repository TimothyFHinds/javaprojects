//Timothy Hinds
public class WeightConversion 
{
	public static void main(String[] args) 
	{
		//The table header
		System.out.print("Kilograms\tPounds");
		System.out.println();
		//extra line printed so the numbers dont start on the table header line
		
		for(int i=1; i<200; i++) {
			System.out.println(i +"\t\t" + Math.round(i * 2.2 * 10) / 10.0);
			//the loop starts at 1 and ends at 199
			//at first i just used spaces to separate the columns
			//but i searched the book and found on pg 126 the escape sequence for tab to tab the lines over
			//I was getting numbers like 22.000000008 so I had to round the pounds to one decimal
		}
		
		

	}

}
