import java.util.Scanner;

public class SwitchCase {

   public static void main(String args[]) {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter your grade");  
	   char grade  = sc.next().charAt(0);

      switch(grade) {
					 case 'A' :
						System.out.print("\n---------------------------------");
						System.out.println("first!"); 
						System.out.print("\n**********************************");

						break;
					 case 'C' :
						System.out.print("\n---------------------------------");
						System.out.println("third");
						System.out.print("\n**********************************");
						break;
					 case 'D' :
						System.out.print("\n---------------------------------");
						System.out.println("You passed");
						System.out.print("\n**********************************");
						break;
					 default :
						System.out.print("\n---------------------------------");
						System.out.println("Invalid grade");
						System.out.print("\n**********************************");
      }
      System.out.println("Your grade is " + grade);
	  
	   // returns the current value of the system timer, in nanoseconds
	 System.out.print("time in nanoseconds = ");
	System.out.print("time in nanoseconds = ");
	 // returns the current time in milliseconds
	System.out.print("Current Time in milliseconds = ");
	System.out.println(System.currentTimeMillis());
   }
}

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your percentage : ");
        int percentageGrade = scanner.nextInt();

        // Check if the grade is capital or small letter grade using a for loop
        char letterGrade;

        if (percentageGrade >= 90) {
            letterGrade = 'A';
        } else if (percentageGrade >= 80) {
            letterGrade = 'B';
        } else if (percentageGrade >= 70) {
            letterGrade = 'C';
        } else if (percentageGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Output the result
        System.out.println("Your letter grade is: " + letterGrade);

        scanner.close();
    }
}

//Scanner sc \\declairtion;
// sc = new :-instantiation
s