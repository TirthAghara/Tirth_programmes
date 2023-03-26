import java.util.Scanner;
 class p73
{
	 public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bank_Account b1=new Bank_Account();
		b1.GetAccountDetails(sc);
		System.out.println("*******************************");
		b1.DisplayAccountDetails();
	}
}
class Bank_Account
{
	int Account_NO;
	String User_Name;
	String Email;
	String Account_Type;
	int Account_Balance;

	void GetAccountDetails(Scanner sc)
	{
		System.out.print("Account_NO=");
		 Account_NO=sc.nextInt();

		 System.out.print("User_Name=");
		  String ans=sc.nextLine();
		  User_Name=sc.nextLine();

		 System.out.print("Email=");
		  Email=sc.nextLine();

		 System.out.print("Account_Type=");
		  Account_Type=sc.nextLine();

		  System.out.print("Account_Balance=");
		  Account_Balance=sc.nextInt();
	}
	void DisplayAccountDetails()
	{
		System.out.println("Account_NO="+Account_NO);
		System.out.println("User_Name="+User_Name);
		System.out.println("Email="+Email);
		System.out.println("Account_Type="+Account_Type);
		System.out.println("Account_Balance="+Account_Balance);
	}
}

