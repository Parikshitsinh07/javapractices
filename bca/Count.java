 public class Count{
	static int r=0;
	Count(){
		r++; 
	}
	
	public static int getCount(){
		return r;
	}
	public static void main (String[]args){
		Count obj1 = new Count();
		Count obj2 = new Count();
		Count obj3 = new Count();
		Count obj4 = new Count();
		
		int  totalCount = Count.getCount();
		System.out.println("Total Count:"+ totalCount);
	
	}
}