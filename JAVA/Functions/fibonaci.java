import java.util.Scanner;
public class fibonaci
{
	public static void fibo(int n)
	{
		int a1=0,a2=1,a3;
		for(int i=0;i<=n;i++)
		{
			System.out.print(" , "+a1);
			a3=a1+a2;
			a1=a2;
			a2=a3;
		}
	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n=");
		int n=sc.nextInt();

		fibo(n);
		
	}
}