import java.util.Scanner;
public class gcd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value a");
		int a=sc.nextInt();
		System.out.print("enter value b");
		int b=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			if(a%i == 0)
			{
				System.out.println("fact a="+i);
			}
		}

		for(int i=1;i<=b;i++)
		{
			if(b%i == 0)
			{
				System.out.println("fact b="+i);
			}
		}
		while(a != b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}

		System.out.print("GCD number is="+a);
	}
}		