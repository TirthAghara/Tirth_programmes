import java.util.Scanner;
public class areaofcircle
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		circle c1=new circle();

		c1.getareaofcircle(sc);
		c1.getperameters(sc);
	}
}
	class circle
	{
		double r;
		double area=0,pera=0;


		void getareaofcircle(Scanner sc)
		{
			System.out.print("value of r=");
			r=sc.nextFloat();
			area=Math.PI*(r*r);
			System.out.println("area="+area);
		}	

		void getperameters(Scanner sc)
		{
			System.out.print("value of r=");
			r=sc.nextFloat();
			pera=2*Math.PI*r;
			System.out.println("pera="+pera);
		}
	}