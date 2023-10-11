import java.util.Scanner;
public class lcm
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value x");
		int x=sc.nextInt();
		System.out.print("enter value y");
		int y=sc.nextInt();
		int lcm=0;
		if(x>y)
		{
			lcm=x;
		}
		else
		{
			lcm=y;
		}
		while(true)
		{
			if(lcm%x==0 && lcm%y==0)
			{
				System.out.print("LCM ="+lcm);
				break;
			}
			lcm++;
		}

	}
}		