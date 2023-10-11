import java.util.Scanner;
public class prime
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("value n");
		int n=sc.nextInt();
		int flag=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				flag++;
			}
		}
		if(flag==2)
		{
			System.out.print("no is prime");
		}
		else
		{
			System.out.print("no is not prime");
		}
	}
}		