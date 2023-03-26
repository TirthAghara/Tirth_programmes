import java.util.Scanner;
public class rev
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("value n");
		int n=sc.nextInt();
		int i,rev=0,b;
			while(n!=0)
			{
				b=n%10;
				rev=(rev*10)+b;
				n=n/10;
			}
			System.out.print("no="+rev);
		}
	}		