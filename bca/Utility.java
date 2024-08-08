import java.util.Scanner;

class Utility{
	
	public static boolean isEven(int no){
		if(no%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public static boolean isOdd(int no){
		if(no%2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
		public static void isPrime(int no){
	       if(no<=1){
			     System.out.println("number is note Prime");
					}
			else{		
			 for(int i=1;i<no/2;i++){
				 
				 if(no%2==0){
					  System.out.println("number is Prime");
				 }
				 else{
					  System.out.println("number is note Prime");
				 }
				}
			 }
		}
		
	public static long factorial(long no){
		
		long fact=1;
		
		for(int i=1; i<=no; i++){
			fact = fact*i;
		}
		return fact;
	}	
	
	public static void main(String [] args){
		
		int no;
		long fact=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to Check Number is Even or not : ");
		no = sc.nextInt();
		
		if (isEven(no)){
			System.out.println(no+" Number is Even");
		}else{
			System.out.println(no+" Number is not Even");
		}
		
		System.out.println();
		
		System.out.print("Enter number to Check Number is Odd or not : ");
		no = sc.nextInt();
		
		if (isOdd(no)){
			System.out.println(no+" Number is Odd");
		}else{
			System.out.println(no+" Number is not Odd");
		}
		
		System.out.println();
		
		System.out.print("Enter number to Check Number is Odd or not : ");
		no = sc.nextInt();
		isPrime(no);
		
		System.out.println();
		
		System.out.print("Enter number to find factorial : ");
		no = sc.nextInt();
		
		fact = factorial(no);
		
		System.out.println("Factorial of "+no+" Number is : "+fact);
		
	}
}



