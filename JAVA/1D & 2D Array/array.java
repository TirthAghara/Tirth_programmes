import java.util.Scanner;
public class array
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		int i,e=0,o=0;
		for(i=0;i<9;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		System.out.print("even="+e);
		System.out.print("odd="+o);
	}
}		