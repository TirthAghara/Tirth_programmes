import java.util.Scanner;
public class divi
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("value a");
		int a=sc.nextInt();
		System.out.print("value b");
		int b=sc.nextInt();
		int i;
		for(i=a; i<=b; i++)
		{
			if(i%2==0 && i%3!=0)
			{
				System.out.println("no="+i);
			}
		}
	}
}	