import java.util.Scanner;
public class studentcons
{
	int enrollment_no;
	String name;
	String gender;
	float marks;
	static int count;

	public studentcons()
	{
		
		
	}

	void getstudentdetails(Scanner sc)
	{
		System.out.print("enrollment_no=");
		enrollment_no=sc.nextInt();

		System.out.print("name=");
		string ans=sc.nextLine();
		name=sc.nextLine();

		System.out.print("gender=");
		gender=sc.nextLine();

		System.out.print("marks=");
		marks=sc.nextFloat();
	}

	void displaystudentdetails()
	{
		System.out.print("enrollment_no="+enrollment_no);
		System.out.print("name="+name);
		System.out.print("gender="+gender);
		System.out.print("marks="+marks);

	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in)

	}
}
