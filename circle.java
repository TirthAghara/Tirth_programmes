import java.util.Scanner;
public class circle
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		double area;
		area=Math.PI*r*r;
		System.out.println("area="+area);
	}
}