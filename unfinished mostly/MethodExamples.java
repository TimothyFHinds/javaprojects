
public class MethodExamples {

	public static void nPrint(String message, int n) {
		for (int i = 0; i<n; i++) {
			System.out.println(message);
		}
	}
	
	public static int sumMethod(int start, int end) {
		
		int returnSum = 0;
		for(int i = start; i<end; i++) {
			returnSum += i;
		}
		return returnSum;
	}
	
	
	public static void main(String[] args) {
		
		int sum = 0;
		nPrint("Hello", 5);
		nPrint("Goodbye", 2);
		nPrint("Cat", 3);
		
		sum = sumMethod(5, 12);
		System.out.println("sum from 5 to 12 is " + sum);
		
		sum = sumMethod(6, 9);
		System.out.println("Sum from 6 to 9 is " +sum);
		

		
	}
}
