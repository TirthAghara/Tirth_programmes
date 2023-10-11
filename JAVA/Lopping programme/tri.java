import java.util.Scanner;
public class tri
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("value of x");
		double x=sc.nextDouble();
		System.out.print("value of y");
		double y=sc.nextDouble();
		System.out.print("value of z");
		double z=sc.nextDouble();
		if(x==y && y==z)
		{
			System.out.println("triangle is equale");
		}
		else if(x==y)
		{
			System.out.println("isoceles");
		}
		else if(y==z) 
		{
			System.out.println("isoceles");
		}
		else if (z==x) 
		{
			System.out.println("isoceles");
		}
		else
		{
			System.out.println("single");
		}
	}	
}		