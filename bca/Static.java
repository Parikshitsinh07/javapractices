public class Static{
	int v1=100;
	int v2=20;
	static int Constuctor_for all=0;
	
	}
	Constuctor(){
		v1=1;
		v2=2;
		System.out.println("in defult not Constructor!!! ");   	
	}
	
	Constuctor(int a){
		v1=a;
		v2=b;
		System.out.println("in defult single Constructor");
		
		
	}
	Constuctor(int a,int b){
		v1=a;
		v2=b;
		System.out.println("in defult Constructor");
		
	}
	public static void main(String wd[]){
		Static h1=new Static(278,23);
		 Static h2=new Static(253,567);
		 Static h3=new Static(12,34);
		System.out.println(add+(h1));
		
	}
	 static int add (Constuctor Temp){
		 return Temp.v1+Temp.v2;
	 }
	
}