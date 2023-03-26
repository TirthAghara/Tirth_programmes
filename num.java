import java.util.Scanner;
public class num
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size");
		int n=sc.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.print("search number");
			int num=sc.nextInt();
		if(a[i]==num)
		{
			System.out.print("number is presenr");
		}
		else	
		{
			System.out.print("number not present");
		}
	}				
}			