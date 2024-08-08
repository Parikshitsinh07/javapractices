 public class Static2{
	 public static  String DEPT="Welcome TO Gujarat Vidhyapith";
	 static void deptName(){
	 System.out.println("Deparment of computer science"+DEPT);
	 }
	 
	 public static void main (String feon[]){
		 //way to access static variable and method
		 System.out.println("form main direct access :" +Static2.DEPT);
		 Static2.deptName();
		 
		 //second way to access static var or method
		 
		 Static2 h1=new Static2();
		 System.out.println("form main direct access :"+ h1.DEPT);
		 h1.deptName();
		 
		  //therd  way to access static var or method
		   
		 System.out.println("form main direct access :" +DEPT);
		 deptName();
	 }
	 
 }
 