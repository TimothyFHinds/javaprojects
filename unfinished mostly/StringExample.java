
public class StringExample 
{

	public static void main(String[] args) 
	{
		//variables
		String s1 = "Hello!";
		String s2 = "Hello!";
		String s3 = new String("Hello!");
		
		//show differences!
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		System.out.println("s1 == s2 is : " + (s1 == s2));
		System.out.println("s2 == s3 is : " + (s2 == s3));
		System.out.println("s2.equals(s3) is : " + (s2.equals(s3)));
		
		for(int i=0; i<s1.length(); i++)
		{
			System.out.print(s1.charAt(i) + " ");
		}
		System.out.println();
		
		
		
	}

}
