import java.util.*;
public class Demo2 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a = Integer.parseInt(args[0]);
		
		
		System.out.println("Enter the value of b");
		int b = Integer.parseInt(args[1]);
		
		
		System.out.println("-----------------------------------------");
		System.out.print("The Sum is : ");

		int c = a+b;
		System.out.print(c);
		System.out.println();

		
		System.out.print("The Difference is : ");

		int d = a-b;
		System.out.print(d);
		System.out.println();

		
		System.out.print("The Product is : ");

		int e = a*b;
		System.out.print(e);
		System.out.println();

		try 
		{
			System.out.print("The Remainder is : ");
			int f = a/b;
			System.out.print(f);
			System.out.println();

		}
		catch(Exception ex)
		{
			System.out.println("Enter non Zero Denominator");
		}
		

	}

}
