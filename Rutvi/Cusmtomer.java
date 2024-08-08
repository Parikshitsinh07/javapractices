import java.util.*;
class Cusmtomer{
	int count=0;
	public static void buying(){
			Scanner sc = new Scanner(System.in);
			Product p = new Product();
			Supplier s = new Supplier();
			Manager m = new Manager();
			Cusmtomer c = new Cusmtomer();
		System.out.println("Product Name:");
		String Proname = sc.nextLine();
		System.out.println("Priduct Quality:");
		int que = sc.nextInt();
		float ProductPrice = p.getPrice(Proname);
		int ProductQue = m.getque(Proname);
		int update = ProductQue-que;
		m.StockAdd(Proname,update);
		float bill= (float)que*ProductPrice;
		System.out.println("Your Total Amount is :" + bill);
		
	}
	public void Add(){
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		Supplier s = new Supplier();
		Manager m = new Manager();
		//Cusmtomer c = new Cusmtomer();
		System.out.print("\tSupplier Name :");
		String SName = sc.nextLine();
		System.out.print("\tProduct Name:");
		String Name = sc.nextLine();
		System.out.print("\tProduct Price:");
		float Price = sc.nextFloat();
		System.out.print("\tProduct Quality:");
		int que = sc.nextInt();
		s.Supply_stock(Name,SName);
		System.out.println("Supplier Added!");
		m.StockAdd(Name,que);
		System.out.println("Quality Added!");
		p.productAdd(Name,Price);
		System.out.println("Product Added!");
	}
	public void show(){
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		Supplier s = new Supplier();
		Manager m = new Manager();
		System.out.print("\tProduct Name:");
		String Name = sc.nextLine();
		p.show(Name);
		m.show(Name);
		s.supply_Show(Name);
		
	}
	public static void main(String []a){
			Scanner sc = new Scanner(System.in);
			Product p = new Product();
			Supplier s = new Supplier();
			Manager m = new Manager();
			Cusmtomer c = new Cusmtomer();
			int Choice;
			do{
				System.out.println("1.Add Product");
				System.out.println("2.buy Product");
				System.out.println("2.Show Product");
				System.out.println("0.Exit");
				System.out.println("Select One Option");
				Choice = sc.nextInt();
				switch(Choice){
					case 1:c.Add();
							break;
					case 2:c.buying();
							break;
					case 3:c.show();
							break;
					default:break;
				}
			}while(Choice!=0);
			
			
			
	}
}