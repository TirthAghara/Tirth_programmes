import java.util.Scanner;
public class matadd
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		int[][] a=new int[4][4];
		int[] r=new int[4];
		int[] c=new int[4];
		int i,j;

		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("enter matrix a");
				a[i][j]=sc.nextInt();
				r[i]=r[i]+a[i][j];
				
			}
		}

		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				c[i]=c[i]+a[j][i];
			}
			System.out.println("   ");
		}		

	
		for(i=0;i<4;i++)
		{
				System.out.println("sum of each row"+r[i]);		
		}
		for(i=0;i<4;i++)
		{
			System.out.println("sum of each col"+c[i]);		
		}
	}
}		