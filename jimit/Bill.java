import java.util.*;
class MyBill{
	public static void Bile(String Name,String Mobile_no,int g_id,int choice,String item,float it_price,float tax,float rgp,float c1,float e1){
		Random rand = new Random();
		Mobile_bill gst= new Mobile_bill();
		int User_id = rand.nextInt(1000);
		
		float fp;
		System.out.println("\t============================================");
		System.out.println("\t||\t   Jay Hind Electonic Shop     \t  ||");
		System.out.println("\t============================================");
		System.out.println("\t  Customer Name :"+ Name + "|  Customer Id:"+ User_id +"");
		System.out.println("\t||Customer Mobile No :"+ Mobile_no+"\t  ||");
		if(g_id!=0){
		System.out.println("\t||Gst Number:  "+ g_id +"\t\t\t  ||");	
		}
		System.out.print("\t||Pyment Method:");
		if(choice==1){
		System.out.println("\t Cash\t\t  ||");
		}
		else if(choice==2){
			int Transaction_id = rand.nextInt(10000);
			System.out.println("Online|Transaction Id:"+ Transaction_id+"||");
		}else if(choice==3){
			int Transaction_id = rand.nextInt(10000);
			System.out.println("Card || Transaction Id:"+Transaction_id+"||");
		}
		else if(choice==4){
			int Transaction_id = rand.nextInt(10000);
			System.out.println("Online|Transaction Id:"+Transaction_id+"||");
		}
		System.out.println("\t--------------------------------------------");
		System.out.println("\t|| Prodect Name Is \t\t|"+item+"\t  ||");
		System.out.println("\t|| Prodect Price Is \t\t|"+it_price+"  ||");
		if(g_id!=0){
			System.out.println("\t|| GST Return \t\t\t|"+rgp+"\t  ||");
		}
		else{
			System.out.println("\t|| GST \t\t\t\t|"+tax+"\t  ||");
		}
		if(choice==2){
			System.out.println("\t|| Casback Offer\t\t|"+c1+"\t  ||");
		}
		if(choice==4){
			System.out.println("\t|| EMI Interst Amount\t\t|"+e1+"\t  ||");
		}
		System.out.println("\t--------------------------------------------");
		
		if(g_id!=0){
			fp=(float)it_price-rgp;
		}
		else if(choice==2){
			fp=(float)it_price+tax-c1;
		}
		else if(choice==4){
			fp=(float)it_price+tax-e1;
		}
		else{
			fp=(float)it_price+tax;
		}
		System.out.println("\t|| Total Price Is \t\t|"+fp+"  ||");
		System.out.println("\t============================================");
			
	}
}
class Bill2{
	public static void main(String [] arg){
		/*MyBill b = new MyBill();
		String Name="Jimit";
		String Mobile_no="1234567890";
		int g_id=12345678;
		int choice=4;
		String item="Leptop";
		int it_price = 12000;
		int tax= 180;
		int rgp=120;
		int c1=1100;
		int e1=120;*/
		System.out.println("Hello");
		b.Bile(Name,Mobile_no,g_id,choice,item,it_price,tax,rgp,c1,e1);
	}
}