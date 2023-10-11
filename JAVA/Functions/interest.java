import java.util.Scanner;
public class interest
{
	public static double method(double P,double R,double N)
	{

		double interest;
		interest=P*R*N/100;
		return interest;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter P");
		double P=sc.nextDouble();
		System.out.print("enter R");
		double R=sc.nextDouble();
		System.out.print("enter N");
		double N=sc.nextDouble();

		double sum=method(P,R,N);
		System.out.print(" "+sum);
	}
}