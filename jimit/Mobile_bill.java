import java.util.*;
public class Mobile_bill{
	static float it_price;		
	static float fp;
	static float Cr_no;
	static int pin;
	static int cnm;
	static float tax=18/100;
	static float c1,c2,c3,c4;
	static int e_month;
	static float  emonth,e1,e2,e3,e4,ins;
	static float  emi;
	static float rgp,gp;
	static int choice;
	static int g_id;
	static String item;
	static String Mobile_no;
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		Mobile_bill mb=new Mobile_bill();// peyment method
		Mobile_bill gst=new Mobile_bill();// for gst method
		MyBill b = new MyBill();
		// normal information
		System.out.println("--------------------------------------");
		System.out.println("Enter your normal information");
		System.out.println("--------------------------------------");
		System.out.print("Enter your name:");
		String Name=sc.nextLine();
	
		//System.out.print("Enter your user_id:");
		//String User_id=sc.nextLine();
		
		//System.out.println("======================================");
		
		while(true){
				System.out.print("Enter your Mobile_no:");
				Mobile_no=sc.next();
		
		if ((int)Mobile_no.length()!=10) {// validation of mo
            System.out.println("Please enter valid mobile no .");

        }
		else
		{
			break;
		}
		}
		gst.Gst_return();
		mb.Pay();
		
		b.Bile(Name,Mobile_no,g_id,choice,item,it_price,tax,rgp,c1,e1);
	} 
	public static void Pay(){
		
		Scanner sc=new Scanner(System.in);
		//m.sop();
		System.out.print("Enter your item name (Like tv,a/c,leptop,etc):");
		item = sc.nextLine();
		System.out.print("Enter your "+item+" price:");
		it_price=sc.nextInt();
		
		System.out.println("Enter your payment methods");
		System.out.println("1. Cash");
		System.out.println("2. Online netbanking");
		System.out.println("3. Credit Card");
		System.out.println("4. EMI");
		System.out.print("Choice : ");
		 choice=sc.nextInt();
			switch(choice){
				case 1: {  
					tax= (it_price*18)/100;
					break;
				}
				case 2:{
					System.out.println("avelable online paymentmethods");
					System.out.println("1.Gpay");
					System.out.println("2.Phone pay");
					System.out.println("3.Paytm");
					System.out.println("4.Bank transfer");
					System.out.println("Selclect One Option:");
					int py = sc.nextInt();
						tax= (it_price*18)/100;
					break;
				}
			case 3:{ 
				tax= (it_price*18)/100;
				float p1;
				System.out.println("avelable cards offers:");
				System.out.println("(1)icici bank \n (2)kotak mahendra \n(3)bajaj finance\n(4)one card");
				System.out.print("please select one card :");
				cnm=sc.nextInt();
				if(cnm==1){
					System.out.print("(1)you get 10% less on this card \n(2)no cost emi");
				}else if(cnm==2){
					System.out.println("(1)you get 5% less on this card\n");
				}else if(cnm==3){
					System.out.println("(1)you get 15% less on this card\n(2)no cost emi (if you complate your in emi in 5 months )||emi is 3%||\n()");
				}else if(cnm==4){
					System.out.println("(1)you get 20% less on this card\n(2)no cost emi (if you complate your in emi in 2 months )||emi is 2%||\n()");
				}
				System.out.println("Enter your credit card no:");
				Cr_no=sc.nextInt();
				System.out.println("Enter your card pin:");
				pin=sc.nextInt();
				if(pin!=12345678){
					System.out.println("pin invalid!!!");
					break;
				}
				else{}
				if(cnm==1){
					c1=(it_price*10)/100;
					//p1=it_price-c1;
					//fp=p1+tax;
						//System.out.println("you get"+c1+"less on your card");
						//System.out.println("your final price is"+fp );
						
					
				}else if (cnm==2){
					c2=(it_price*5)/100;
					//p1=it_price-c2;
					//fp=p1+tax;
					//System.out.println("you get"+c2+"less on your card");
						//System.out.println("your final price is"+fp );
				}else if (cnm==3){
					System.out.println("Enter your for how many days you will pay the installments:");
					e_month=sc.nextInt();
					if(e_month<=5){
						c1=(it_price*15)/100;
						//fp=it_price+tax-c3;
						//System.out.println("you get"+c3+"less on your card");
						//System.out.println("your final price is"+fp );
					}else{
						c1=(it_price*15)/100;
						e1=(it_price*3)/100;
						//fp=it_price+tax+emi-c3;
						//System.out.println("you get"+c3+"less on your card");
						//System.out.println("your final price is"+fp );
					}								
				}else if(cnm==4){
					System.out.println("Enter your for how many days you will pay the installments:");
					e_month=sc.nextInt();
					if(e_month<=2){
						c1=(it_price*20)/100;
						//fp=it_price+tax-c4;
						//System.out.println("you get"+c4+"less on your card");
						//System.out.println("your final price is"+fp );
					}
					else{
							c4=(it_price*20)/100;
							e1=(it_price*2)/100;
							//fp=it_price+tax+emi-c4;
							//System.out.println("you get"+c4+"less on your card");
							//System.out.println("your final price is"+fp );
						}
				
			}
			break;}
						
			case 4:{float p2;
							System.out.println("Enter for how many days you will pay the installments:");
							emonth = sc.nextInt();
							if (emonth <= 3) {
											//System.out.println("Your orignal item price:"+it_price);
											tax= (it_price*18)/100;
											//System.out.println("Your  item tax (GST):"+tax);
											p2=it_price+tax;
											e1 = (p2*2)/100;
											//System.out.println("Your  item emi charges:"+e1);
											//fp = it_price + e1;
											//ins = fp / emonth;
											//System.out.println("Your Per month installment amount: " + ins);
							}
							else if(emonth <= 6){
											//System.out.println("Your orignal item price:"+it_price);
											tax= (it_price*18)/100;
											//System.out.println("Your  item tax (GST):"+tax);
											p2=it_price+tax;
											e1 = (p2*4)/100;
											//System.out.println("Your  item emi charges:"+e1);
											//fp = it_price + e1;
											//ins = fp / emonth;
											//System.out.println("Your Per month installment amount: " + ins);
							}
							else if(emonth <= 12){
											//System.out.println("Your orignal item price:"+it_price);
											tax= (it_price*18)/100;
											//System.out.println("Your  item tax (GST):"+tax);
											p2=it_price+tax;
											e1 = (p2*5)/100;
											//System.out.println("Your  item emi charges:"+e1);
											//fp = it_price + e1;
											//ins = fp / emonth;
											//System.out.println("Your Per month installment amount: " + ins);
							}
							break;
			}

							 
        }
	}
	public static void Gst_return(){
					
					Scanner sc=new Scanner(System.in);
					System.out.println("Are You Wender(Y/N):");
					String Wnder = sc.nextLine();
					if(Wnder=="yes"){
						System.out.print("Enter your gst id:");
						g_id=sc.nextInt();
					//System.out.println("your item price is :"+it_price);
						gp=it_price-tax;
						rgp=it_price-gp;
					}
					
					//System.out.println("your item return Gst amount is :"+rgp);
					//System.out.println("your item final  price is :"+gp);
					
					
	}
}
	


