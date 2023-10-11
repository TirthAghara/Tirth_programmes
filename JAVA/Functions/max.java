import java.util.Scanner;
public class max
{
	public static double max(double x,double y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
		public static void  main(String[] args)
		{
			Scanner sc=new Scanner(System.in);

			System.out.print("enter x");
		 	double x=sc.nextDouble();
			System.out.print("enter y");
			double y=sc.nextDouble();

			max(x,y);
			System.out.print("max number is "+max(x,y));
		}
}