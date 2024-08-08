public class Hw2{
	int v1=34;
	int v2=34;
	int add();
			Hw2 (){}
			Hw2(int a,int b){
				v2=b;
				v1=a;
				System.out.println("jkgreji");
				System.out.println("v1"+v2);
			}
			public static void main (String[] as){
				Constructor H=new Constructor(12,21);
				Constructor H2=new Constructor(23,43);
				Constructor H3=new Constructor(12,432);
				System.out.println(add(H));
			}
		    static int add (Constructor temp){
				return temp.v1+temp.v2;
			}
	}
