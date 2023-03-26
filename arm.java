import java.util.Scanner;
public class arm
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value a");
		int a=sc.nextInt();
		int sum=0,digit,x=0,temp1,temp2;
		temp1=a;
		temp2=a;
		while(temp1!=0)
		{
			digit=a%10;
			x++;
			temp1=temp1/10;
			System.out.println("digit="+x);
		}

		while(a != 0)
		{
			digit=x%10;
			sum+=(Math.pow(digit,x));
			a=a/10;
		}

		if(sum == temp2)
		{
			System.out.print("number is armstrong");
		}
		else
		{
			System.out.print("number is not armstrong");
		}
	}
}		