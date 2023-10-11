import java.util.Scanner;
public class cal
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("give ope('+','-','/','*')");
		char ope=sc.next().charAt(0);
		System.out.print("value of a");
		int a=sc.nextInt();
		System.out.print("value of b");
		int b=sc.nextInt();
		int c;
		switch(ope)
		{
			case '+':
				{
					System.out.println("addition");
					c=a+b;
					System.out.println("c="+c);
					break;
				}	
			case '-':
				{
					System.out.println("substraction");
					c=a-b;
					System.out.println("c="+c);
					break;
				}	
			case '/':
				{
					System.out.println("divide");
					c=a/b;
					System.out.println("c="+c);
					break;
				}
			case '*':
			{
					System.out.println("multiplication");
					c=a*b;
					System.out.println("c="+c);
					break;
			}
			default:
			{
				System.out.println("wrong output");
			}
		}
	}
}			