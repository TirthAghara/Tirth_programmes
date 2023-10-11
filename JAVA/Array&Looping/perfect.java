import java.util.Scanner;
public class perfect
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value n");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("digit="+i);
				sum=sum+i;
			}
		}

		if(n == sum)
		{
			System.out.println("number is perfect");
		}
		else
		{
			System.out.println("number is not perfect");
		}
	}
}		