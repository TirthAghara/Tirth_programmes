import java.util.Scanner;
 public class p72
  		{
  			public static void  main(String[] args)
  			{
  				Scanner sc=new Scanner(System.in);

  				Candidate c1=new Candidate();

  				c1.GetcandidateDetails(sc);

  				System.out.println("*******************************");
  				
  				c1.DisplaycandidateDetails();
  			}
  		}

 class Candidate
{
	int Candidate_ID;
	String Candidate_Name; 
	int Candidate_Age;
	int Candidate_Weight;
	int Candidate_Height;

	 void  GetcandidateDetails(Scanner sc)
	{
		System.out.print("Candidate_ID=");
		 Candidate_ID=sc.nextInt();

		System.out.print("Candidate_Name=");
		 String ans=sc.nextLine();
		 Candidate_Name=sc.nextLine();

		System.out.print("Candidate_Age=");
		 Candidate_Age=sc.nextInt();

		System.out.print("Candidate_Weight=");
		 Candidate_Weight=sc.nextInt();

		System.out.print("Candidate_Height=");
		 Candidate_Height=sc.nextInt();

	}
	 void DisplaycandidateDetails()
	{
		System.out.println("Candidate_ID="+Candidate_ID);
		System.out.println("Candidate_Name="+Candidate_Name);
		System.out.println("Candidate_Age="+Candidate_Age);
		System.out.println("Candidate_Weight="+Candidate_Weight);
		System.out.println("Candidate_Height="+Candidate_Height);
	}	
}