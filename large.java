import java.util.Scanner;
public class large
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("value of a");
		int a=sc.nextInt();
		System.out.print("value of b");
		int b=sc.nextInt();
		System.out.print("value of c");
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.print("a is largest");
			} 
			else
			{
				System.out.print("c is largest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.print("b is largest");

			}
			else
			{
				System.out.print("c is largest");
			}
		}
	}
}						