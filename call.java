import java.util.Scanner;
public class call
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("number of call");
		int call=sc.nextInt();
		double b,bill;
		if(call<100)
		{
			System.out.print("bill 200");
		}
		else if(call >= 100  && call <= 150 )
		{
			b=call-100;
			bill=200+(b*0.60);
			System.out.print("bill="+bill);
		}
		else if(call >= 150  && call <= 200)
		{
			bill=200+30+(call-100)*0.50;
			System.out.print("bill="+bill);
		}
		else if(call>=200)
		{
			bill=200+30+20+(call-100)*0.40;
			System.out.print("bill="+bill);
		}
		else
		{
			System.out.print("invaild input");

		}
	}
}		