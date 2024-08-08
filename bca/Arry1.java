import java.util.Scanner;
class Arry1{
   public static void main(String[] s){
   
   int size;
   Scanner sc= new Scanner(System.in);
   
   System.out.println("Enter Your Arry lenght:");
    size =  sc.nextInt();
	System.out.println(""+size);
    int [] arry= new int[size];   	
	 
	 for(int i=0;i<size;i++){
		 System.out.println("Enter Your :"+i+" Element");
		 arry[i]=sc.nextInt();
	 }
	 for(int i=0;i<size;i++){
		 System.out.println(" "+arry[i]);
	 }
   }
}