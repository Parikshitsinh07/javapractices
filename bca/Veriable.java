class Veriabl{
	static int b=78;//Static
	int c=45;//Instance
	public static void main(String[] asf)
	{
		int a=95;//Local
		Veriabl ref=new Veriabl();
		System.out.println(a);
		System.out.println(a.b);
		System.out.println(ref.c);
	}
}