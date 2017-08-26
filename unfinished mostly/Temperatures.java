//Timothy Hinds
import java.util.Scanner;
public class Temperatures 
{
	public static void main(String[] args)
	{
		
		double celsius, fahrenheit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius");
		celsius = input.nextDouble();
		
		fahrenheit = (9 / 5.0) * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		
	}
}
