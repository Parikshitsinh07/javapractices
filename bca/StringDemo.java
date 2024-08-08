public class StringDemo{
    public static void main(String s[]){
		//String mutabel
		String s2=new String("ABCD");
		System.out.println("hash Code:"+s2.hashCode());
		s2=s2+"swqe";
		System.out.println("hash Code:"+s2.hashCode());
		
	// hashCode je object ni method 6
	
	//String Buffer 
	StringBuffer sb=new StringBuffer("ABCD");
	System.out.println("Sb hash Code:"+sb.hashCode());
	sb.append("XYZ");
	System.out.println("sb hash Code:"+sb.hashCode());
	
   }
}