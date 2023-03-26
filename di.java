import java.util.Scanner;
import java.lang.Math;
public class di
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double r,di;
		System.out.println("value of area");
		double area=sc.nextDouble();
		r=Math.sqrt(area/Math.PI);
		System.out.println("r="+r);
		di=2*r;
		System.out.println("diameter"+di);
	}
}		