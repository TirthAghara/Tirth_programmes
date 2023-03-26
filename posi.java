import java.util.Scanner;
public class posi
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("value of a");
		int a=sc.nextInt();
		if(a>=0)
		{
			System.out.println("number positive="+a);
		}
		else
		{
			System.out.println("number negative="+a);
		}	
	}
}		