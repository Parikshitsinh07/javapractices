//working with user inport
//do note import Scannar

import java.util.Scanner; 
public class Demo20{
	public static void main(String[] ruts){
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter one line");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("======================");
		
		System.out.println("plase Enter integer");
		int intVal = sc.nextInt();
		System.out.println("please Enter square is:");
		System.out.println(intVal+intVal);
		System.out.println("======================");
		
		System.out.println("plase Enter Charcter");
		char charVal = sc.next().charAt(2);
		System.out.println("plase Enter Charcter is");
		System.out.println(charVal);
		
		sc.close();
		
		//shall we try  using scanner here
		//int intVal = sC1.NEXTInt();
	}
}