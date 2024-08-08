import java.util.*;
class User_Info{
	Scanner sc= new Scanner(System.in);
	public void Info(){
		// normal information
		System.out.println("--------------------------------------");
		System.out.println("Enter your normal information");
		System.out.println("--------------------------------------");
		System.out.print("Enter your name:");
		String Name=sc.nextLine();
		int User_id = rand.nextInt(1000);
		
		//System.out.println("======================================");
		
		while(true){
				System.out.print("Enter your Mobile_no:");
				String Mobile_no=sc.next();
		
		if ((int)Mobile_no.length()!=10) {// validation of mo
            System.out.println("Please enter valid mobile no .");

        }
		else
		{
			break;
		}
		}
	}
}