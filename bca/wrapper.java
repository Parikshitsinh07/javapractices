 public class wrapper{
	public static void main(String s[]){
		Character ch=new Character('Z');
		char ch1='b';
		int a=68;
		
		wrapper h=new wrapper();
		h.test((char)a);
		h.test2(ch1);
		

  }
  public static void test(char c){
	  System.out.println("The character is :"+c);
  }
  public static void test2(Character c){
	  System.out.println("The character Object :"+c);

	}

}
 