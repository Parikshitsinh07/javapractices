import java.util.Scanner;

public class Swich {

    public static void main(String args[]) {  
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter your grade");  
	   char grade  = sc.next().charAt(0);

      switch(grade) {
					 case 'A' :
						System.out.print("\n=========================================");
						System.out.println("first!"); 
						System.out.print("\n=========================================");

						break;
					 case 'C' :
						System.out.print("\n=========================================");
						System.out.println("third");
						System.out.print("\n=========================================");
						break;
					 case 'D' :
						System.out.print("\n=========================================");
						System.out.println("You passed");
						System.out.print("\n=========================================");
						break;
					 default :
						System.out.print("\n=========================================");
						System.out.println("Invalid grade");
						System.out.print("\n=========================================");
      }
      System.out.println("Your grade is " + grade);
	  
	   // returns the current value of the system timer, in nanoseconds
	System.out.print("time in nanoseconds = ");
	System.out.println(System.nanoTime());
	
	  // returns the current time in milliseconds
	System.out.print("Current Time in milliseconds = ");
	System.out.println(System.currentTimeMillis());
  }
}