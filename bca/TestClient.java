class TestClient{
	public static void main (String[] ads){
		
		System.out.println("Dog : ");

		//create in object classof the subclass
		Dog puppy=new Dog();
		//access field of superclass
		
		puppy.name="mukharsde";
		puppy.display();
		
		//call method of superclass
		puppy.eat();
			
		System.out.println("Cow : ");
		//create in object classof the subclass

		Cow cow=new Cow();
	    //access field of superclass

		cow.name = "pari";
		cow.display();
		
		//call method of superclass
		cow.eat();
		cow.speek();
	}
}