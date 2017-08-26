
public class SwapExample {

	public static void swap(int x, int y) {
		System.out.println("X is " + x + " and Y is " + y + " before swapping INSIDE METHOD");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("X is " + x + " and Y is " + y + " after swapping INSIDE METHOD");
		
	}
	
	
	public static void main(String[] args) {

		int x = 1, y = 2;
		System.out.println("X is " + x + " and Y is " + y + " before swapping");
		swap(x, y);
		System.out.println("X is " + x + " and Y is " + y + " after swapping");
		
		
	}

}
