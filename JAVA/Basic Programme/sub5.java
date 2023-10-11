import java.util.Scanner;
public class sub5
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter s1=");
		int s1=sc.nextInt();
		System.out.print("enter s2=");
		int s2=sc.nextInt();
		System.out.print("enter s3=");
		int s3=sc.nextInt();
		System.out.print("enter s4=");
		int s4=sc.nextInt();
		System.out.print("enter s5=");
		int s5=sc.nextInt();
		int per;
		per=(s1+s2+s3+s4+s5)/5;
		System.out.println("per="+per);
		if(per<35)
		{
			System.out.print("fail");
		}
		else if (per>=35 && per<45)
		{
			System.out.print("student pass");
		}
		else if (per>=45 && per<60)
		{
			System.out.print("student pass second class");
		}
		else if (per>=60 && per<70)
		{
			System.out.print("student pass first class");
		}
		else if(per>=70 && per<100)
		{
			System.out.print("student pass distictuin");
		}
		else
		{
			System.out.print("invalid input");
		}
	}
}		