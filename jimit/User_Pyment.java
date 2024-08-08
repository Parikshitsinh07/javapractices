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
	static String item;
	static int choice;
	static int g_id;
	
	public static void main (String []args){
		Random rand = new Random();
		Scanner sc= new Scanner(System.in);
		Mobile_bill mb= new Mobile_bill();// peyment method
		// for gst method
		// normal information
		System.out.println("--------------------------------------");
		System.out.println("Enter your normal information");
		System.out.println("--------------------------------------");
		System.out.print("Enter your name:");
		static String Name=sc.nextLine();
		static int User_id = rand.nextInt(1000);
		
		//System.out.println("======================================");
		
		while(true){
				System.out.print("Enter your Mobile_no:");
				static String Mobile_no=sc.next();
		
		if ((int)Mobile_no.length()!=10) {// validation of mo
            System.out.println("Please enter valid mobile no .");

        }
		else
		{
			break;
		}
		}
		mb.Pay();
		mb.Bill();
	} 
	public static void Pay(){
		
		Scanner sc=new Scanner(System.in);
		Mobile_bill gst= new Mobile_bill();
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
					System.out.println("Your orignal item price:"+it_price); 
					System.out.println("Are You Wander (y/n):");
					String Wander = sc.next();
					if(Wander=="y"){
						gst.Gst_return();
					}
					else{
						tax= (it_price*18)/100;
						//System.out.println("Your item tax(GST):"+tax);
						//fp=it_price+tax;
						//System.out.println("Your final payble priceis :" +fp);
					}
					break;
				}
				case 2:{
					System.out.println("avelable online paymentmethods");
					System.out.println("Gpay");
					System.out.println("Phone pay");
					System.out.println("Paytm");
					System.out.println("Bank transfer");
					System.out.println("Your orignal item price:"+it_price);
					tax= (it_price*18)/100;
					//System.out.println("Your item tax(GST):"+tax);
					fp=it_price+tax;
					//System.out.println("Your final payble priceis"+fp);
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
				if(pin!=635640){
					System.out.println("pin invalid!!!");
					break;
				}
				else{}
				if(cnm==1){
					c1=(it_price*10)/100;
					p1=it_price-c1;
					//fp=p1+tax;
						//System.out.println("you get"+c1+"less on your card");
						//System.out.println("your final price is"+fp );
						
					
				}else if (cnm==2){
					c1=(it_price*5)/100;
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
						emi=(it_price*3)/100;
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
							c1=(it_price*20)/100;
							emi=(it_price*2)/100;
							fp=it_price+tax+emi-c4;
							//System.out.println("you get"+c4+"less on your card");
							//System.out.println("your final price is"+fp );
						}
				
			}
			break;}
						
			case 4:{float p2;
							System.out.println("Enter for how many days you will pay the installments:");
							emonth = sc.nextInt();
							if (emonth <= 3) {
											System.out.println("Your orignal item price:"+it_price);
											tax= (it_price*18)/100;
											//System.out.println("Your  item tax (GST):"+tax);
											p2=it_price+tax;
											e1 = (p2*2)/100;
											//System.out.println("Your  item emi charges:"+e1);
											fp = it_price + e1;
											ins = fp / emonth;
											//System.out.println("Your Per month installment amount: " + ins);
							}
							else if(emonth <= 6){
											System.out.println("Your orignal item price:"+it_price);
											tax= (it_price*18)/100;
											System.out.println("Your  item tax (GST):"+tax);
											p2=it_price+tax;
											e1 = (p2*4)/100;
											System.out.println("Your  item emi charges:"+e1);
											fp = it_price + e1;
											ins = fp / emonth;
											System.out.println("Your Per month installment amount: " + ins);
							}
							else if(emonth <= 12){
											//System.out.println("Your orignal item price:"+it_price);
											tax= (it_price*18)/100;
											//System.out.println("Your  item tax (GST):"+tax);
											p2=it_price+tax;
											e1 = (p2*5)/100;
											//System.out.println("Your  item emi charges:"+e1);
											fp = it_price + e1;
											ins = fp / emonth;
											//System.out.println("Your Per month installment amount: " + ins);
							}
							break;
			}

							 
        }
	}
	public static void Gst_return(){
					
					Scanner sc=new Scanner(System.in);
					System.out.print("Enter your gst id:");
					g_id=sc.nextInt();
					System.out.println("your item price is :"+it_price);
					gp=it_price-tax;
					rgp=it_price-gp;
					System.out.println("your item return Gst amount is :"+rgp);
					System.out.println("your item final  price is :"+gp);
					
					
	}
	public static void Bill(){
		Random rand = new Random();
		Mobile_bill gst= new Mobile_bill();
		System.out.println("\t=======================================");
		System.out.println("\t||\tJay Hind Electonic Shop\t\t||");
		System.out.println("\t=======================================");
		System.out.println("\t||Customer Name :"+ Name + "Customer Id:"+ User_id +"||");
		System.out.print("\t||Customer Mobile No :"+ Mobile_no +"\t\t||" );
		if(g_id!=0){
		System.out.println("Gst Number:"+ g_id +"\t\t||");	
		}
		System.out.println("");
		System.out.print("Pyment Method :");
		if(choice==1){
		System.out.println("Cash\t||");
		}
		else if(choice==2){
			int Transaction_id = rand.nextInt(10000000);
			System.out.println("Online\t|| Transactio:"+ Transaction_id);
		}else if(choice==3){
			int Transaction_id = rand.nextInt(10000000);
			System.out.println("Card Pyment\t|| Transactio:"+Transaction_id);
		}
		else if(choice==4){
			int Transaction_id = rand.nextInt(10000000);
			System.out.println("Online\t|| Transactio:"+Transaction_id);
		}
		System.out.println("\t---------------------------------------");
		System.out.println("\t|| Prodect Name Is :"+item+"\t|\t||");
		System.out.println("\t|| Prodect Price Is \t\t|"+it_price+"\t||");
		if(g_id!=0){
			System.out.println("\t|| GST Return \t\t\t\t|:"+rgp+"\t||");
		}
		else{
			System.out.println("\t|| GST \t\t\t\t\t|:"+tax+"\t||");
		}
		if(choice==2){
			System.out.println("\t||casback Offer \t|"+c1+"\t||");
		}
		if(choice==4){
			System.out.println("\t||EMI Interst Amount\t\t|"+e1+"\t\t||");
		}
		System.out.println("\t---------------------------------------");
		
		if(g_id!=0){
			fp=it_price-rgp;
		}
		else if(choice==2){
			fp=it_price-tax-c1;
		}
		else if(choice==4){
			fp=it_price-tax-e1;
		}
		else{
			fp=it_price-tax;
		}
		System.out.println("\t\t\t Total Price Is \t"+fp+"\t\t||");
		
			
	}
}
	


