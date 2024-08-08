import java.util.Scanner;

public class  IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        char grade;

        if (percentage >= 90) {
            grade = 'A';
			System.out.println("Congractulations!!!!!");
			
        } else if (percentage >= 80) {
            grade = 'B';
			System.out.println("Good Works......");
			
        } else if (percentage >= 70) {
            grade = 'C';
			System.out.println("Best");
		
        } else if (percentage >= 60) {
            grade = 'D';
			System.out.println("good");
        } else if (percentage >= 50) {
            grade = 'E';
			System.out.println("nice work");
			
        } else {
            grade = 'F';
			System.out.println("Betar baluk next Time");
        }

        System.out.println("Your grade is: " + grade);
		
		//Second NanoSecond
		System.out.print("time in nanoseconds = ");
		System.out.print("time in nanoseconds = ");
		
		// returns the current time in milliseconds
	   System.out.print("Current Time in milliseconds = ");
	   System.out.println(System.currentTimeMillis());
    }
}
