import java.util.Scanner;
public class peli
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value n");
		int n=sc.nextInt();
		int rev=0,digit;
		int temp=n;
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}

		if(temp==rev)
		{
			System.out.print("number is pailndrome");
		}
		else
		{
			System.out.print("number is not pailndrome");
		}
	}
}		