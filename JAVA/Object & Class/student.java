import java.util.Scanner;
class studentinfo
{
	int Enrollment_NO;
	String Student_Name;
	int sem;
	float cpi;
	float spi;

	void GetstudentDetails(Scanner sc)
	{
		System.out.print("Enrollment_NO");
		Enrollment_NO=sc.nextInt();

		System.out.print("Student_Name");
		String ans=sc.nextLine();
		Student_Name=sc.nextLine();

		System.out.print("sem");
		sem=sc.nextInt();

		System.out.print("cpi");
		cpi=sc.nextFloat();

		System.out.print("spi");
		spi=sc.nextFloat();

	}
	void DiplaystudentDetails()
	{
		System.out.println("Enrollment_NO="+Enrollment_NO);
		System.out.println("Student_Name="+Student_Name);
		System.out.println("SEM"+sem);
		System.out.println("CPI="+cpi);
		System.out.println("SPI="+spi);
	}

}	
	class student
	{
		public static void main(String[]args)
		{

			Scanner sc=new Scanner(System.in);

			studentinfo st=new studentinfo();

			st.GetstudentDetails(sc);
			System.out.println("-------------------------------------------------");
			st.DiplaystudentDetails();
		}

	}