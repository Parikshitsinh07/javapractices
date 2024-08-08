public class Hw{
	int v1;
	int v2;
	private static Hw(){
		 System.out.println("In defalt constructur");
		v1=1;
		v2=1;	
	}
    Hw(int a){
		v1=a;
		v2=b;
	    System.out.println("In defalt constructur");
		System.out.println("v1 and v2 are intialized"+a);
		
	}
	 Hw(int a,int b){
		v1=a;
		v2=b;
	    System.out.println("In defalt constructur");
		System.out.println("v1 and v2 are intialized"+a+"v2="+b);

	public static void main(String []a){
		Hw h2=new Hw(10);
		System.out.println("sart val int"+h2.v1);	
	}
}
