/* over londing
 @Dare 08/08/2023 */
 
 public class OverLoadDemo{
	public static float add(float A,float B){
		return A+B;
	} 
	public static int add(int A,int B){
		return A+B;
	} 
	public static int add(int A,int B,int C){
		return A+B+C;
	} 
	public static int add(char A,char B,char C){
		return (int)A+(int)B+(int)C;
	} 
	public static int odd(char A,char B,char C){
		return (int)A+(int)B+(int)C;
		
	}
	public static void main(String[] ards){
		System.out.println("Method"+OverLoadDemo.odd("a","b","c"));
	}
	
	
	  
	 
 }
 
 