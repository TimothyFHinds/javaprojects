import java.util.Scanner;

public class NumberAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0;
		double[] numbers;
		double sum = 0.0, average;
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter?");
		n = input.nextInt();
		
		//request memory for numbers
		numbers = new double[n];
		
		
		//read n doubles in to numbers, keep track of the sum for average
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		average = sum / n;
		//conduct analysis of #'s above average
		for(double e : numbers) {
			if(e > average) {
				count++;
			}
		}
		
		//display result
		System.out.println("There are " + count + " numbers above the average.");
		//clean up
		input.close();

	}

}
