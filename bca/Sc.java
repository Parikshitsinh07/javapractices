//working with user inport
//do note import Scannar

import java.util.Scanner; 
public class Sc{
	public static void main(Sring[] ruts){
		Scanner sc1=new Scannar(System.in);
		System.out.println("please Enter one line");
		String str = sc1.nextLine("enter line is :");
		System.out.println(str);
		System.out.println("======================");
		
		System.out.println("plase Enter integer");
		int intVal = sc1.nextInt();
		System.out.println("please Enter square is:");
		System.out.println(intVal*intVAl);
		System.out.println("======================");
		
		System.out.println("plase Enter Charcter");
		char charVal = sc1.next().charAt(2);
		System.out.println("plase Enter Charcter is");
		System.out.println(charVal);
		
		sc1.close();
		
		//shall we try  using scanner here
		//int intVal = sC1.NEXTInt();
	}
}