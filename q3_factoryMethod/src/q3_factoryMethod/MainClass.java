package q3_factoryMethod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Double price;
		Set<String> product;
		Double dis=0.0;
		MainClass mc=new MainClass();
		HashMap<String,Double> hm=mc.getItem(sc);
		product=hm.keySet();
		price=hm.get(product.iterator().next());
		
		
		System.out.println("Enter 1 for FirstTime customer, 2 for Regular");
		int ch=sc.nextInt();
		if(ch==1) {
			dis+=new FirstTime().getDiscount();
		}else {
			dis+=new Regular().getDiscount();
		}
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=60) {
			dis+=new Senior().getDiscount();
		}
		System.out.println("Product->"+product.iterator().next());
		System.out.println("Price->"+price);
		System.out.println("Total Discount->"+dis);
		System.out.println("Final price->"+(price-price*dis));
		sc.close();
	}
	
	public HashMap<String,Double> getItem(Scanner sc){
		System.out.println("Enter 1 to buy Cricket Bat, 2 to Badminton Racket");
		int ch=sc.nextInt();
		IProductType pt;
		if(ch==1) {
			pt=new Cricket();
		}else {
			pt=new Badminton();
		}
		
		return pt.giveItem();
	}
}
