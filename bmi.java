import java.util.Scanner;
public class bmi
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("value of pou");
		double pou=sc.nextDouble();
		System.out.println("value of inch");
		double inch=sc.nextDouble(),height,weight,bmi;
				
		weight=0.4535*pou;
		height=0.0254*inch;
		bmi=weight/(height*height);
		System.out.println("value of kg="+weight);
		System.out.println("value of meter="+height);
		System.out.println("bmi="+bmi);
	}
}		 