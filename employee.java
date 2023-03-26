import java.util.Scanner;
public class employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		employeeinfo e1=new employeeinfo();

		e1.GetemployeeDetails(sc);

		System.out.println("------------------------------------");

		e1.DisplayemployeeDetails();
	}
}

	class employeeinfo
	{	
		int employee_ID;
		String employee_Name;
		String designation;
		int employee_Age;
		int employee_Salary;
			public void GetemployeeDetails(Scanner sc)
			 {
				System.out.print("employee_ID=");
				employee_ID=sc.nextInt();

				System.out.print("employee_Name=");
				String ans=sc.nextLine();
				employee_Name=sc.nextLine();

				System.out.print("designation=");
				designation=sc.nextLine();

				System.out.print("employee_Age=");
				employee_Age=sc.nextInt();

				System.out.print("employee_Salary=");
				employee_Salary=sc.nextInt();
			 }
			public void DisplayemployeeDetails()
			 {
				System.out.println("employee_ID="+employee_ID);
				System.out.println("employee_Name="+employee_Name);
				System.out.println("designation="+designation);
				System.out.println("employee_Age="+employee_Age);
				System.out.println("employee_Salary="+employee_Salary);
			 }
	}