import java.util.Scanner;
public class vowel
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("give char in x");
		char x=sc.next().charAt(0);
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U')	
		{
			System.out.println("char is vowel");
		}
		else
		{
			System.out.println("char is consonent");
		}
	}
}