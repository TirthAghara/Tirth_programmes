import java.util.Scanner;
public class arraysum
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size");
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%3==0 || a[i]%5==0)
			{
				sum=sum+a[i];
				System.out.println("no="+a[i]);
			}			
		}
			System.out.print("sum="+sum);
	}
}		