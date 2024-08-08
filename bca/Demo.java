class Demo{
	int v1;
	static int Common_for_all=10;
	Demo(){
		System.out.println("in default Constustor!!!");
		v1=5;
	}
	public static void main(String a[]){
		System.out.println("int main Method");
		Demo instance_1=new Demo();
		Demo instance_2=new Demo();
		Demo instance_3=new Demo();
		
		System.out.println("========");
		
		instance_1.printMsg();
		instance_2.printMsg();
		instance_3.printMsg();
	}
	void printMsg(){
		Common_for_all++;
		v1++;
	    System.out.println("int Common_for_all "+Common_for_all);
		System.out.println("int v1"+v1);

	}

}