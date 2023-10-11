import java.util.Scanner;
public class matmulti
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter matrix a row");
		int r1=sc.nextInt();
		System.out.print("enter matrix a col");
		int c1=sc.nextInt();
		System.out.print("enter matrix b row");
		int r2=sc.nextInt();
		System.out.print("enter matrix b col");
		int c2=sc.nextInt();
		int[][] a=new int[r1][c1];
		int[][] b=new int[r2][c2];
		int[][] c=new int[r1][c2];
		int i,j,k;
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print("enter array a");
				a[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print("enter array b");
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(k=0;k<c1;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(" "+c[i][j]);
			}
			System.out.println("   ");
		}
	}
}		