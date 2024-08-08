import java.io.*;
import java.util.*;

class Product{
		HashMap<String, Float> Product = new HashMap<>();
		Random rand = new Random();
		//float ProductPrice;
		
		public void productAdd(String productName ,float price){
				int Product_id = rand.nextInt(1000);
				Product.put(productName, price);
				//return Product_id;

		}
		public void productRemove(String productName){
				 Product.remove(productName);
		}
		/*public void showAllProduct(){
			 for (Product.Entry<String, Integer> e : Product.entrySet())
					System.out.println("Product: " + e.getKey()
                               + " Price: " + e.getValue());
		}*/
		public void show(String productName){
				System.out.println("This Product Name is" + productName + "and Price" + Product.get(productName));
		}
		public void ckeckProduct(String productName){
				Product.containsKey(productName);
		}
		public float getPrice(String productName){
			return Product.get(productName);
		}
}


class Supplier{
		HashMap<String, String> ProductSupply = new HashMap<>();
		Random rand = new Random();
		public void Supply_stock(String supplierName,String productName){
				int Supply_id = rand.nextInt(1000);
				ProductSupply.put(productName,supplierName);
		}
		public void supply_Show(String productName){
			System.out.println("The Product is "+productName+"Supplier Name is"+ProductSupply.get(productName));
		}
		/*public void all_sullpy(){
			 for (ProductSupply.Entry<String, Integer> e : ProductSupply.entrySet())
					System.out.println("Supplier Name: " + e.getValue()
                               + " Product Name: " + e.getKey());
		}*/
		public void supplyRemove(String productName){
				 ProductSupply.remove(productName);
		}
}

class Manager{
	HashMap<String, Integer> Stock = new HashMap<>();
	public void StockAdd(String productName ,int Quality){
				Stock.put(productName, Quality);
				//return Product_id;

		}
		public void StockRemove(String productName){
				 Stock.remove(productName);
		}
		/*public void showStock(){
			 for (Stock.Entry<String, Integer> e : Stock.entrySet())
					System.out.println("Product: " + e.getKey()
                               + " Quality : " + e.getValue());
		}*/
		public void show(String productName){
			System.out.println( "This"+ productName +"quality is " + Stock.get(productName));
		}
		public void ckeckStock(String productName){
				Stock.containsKey(productName);
		}
		public int getque(String productName){
			return Stock.get(productName);
		}
	
}