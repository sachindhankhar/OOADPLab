package q9_template;

import java.util.HashMap;
import java.util.Scanner;

public class OfflineMode extends Payment{

	Scanner sc=new Scanner(System.in);
 	HashMap<String,Integer> items=new HashMap<>();
 	String product;
 	Integer price;
 	OfflineMode(Items item){
 		this.items=item.getItem();
 		for(String k:items.keySet()) {
 			System.out.println("Item->"+k+"\t,Price"+items.get(k));
 		}
 	}
	public void selectitem() {
		System.out.println("Enter Item");
		product=sc.next();
		price=items.get(product);
	}

	public void doPayment() {
		System.out.println("Cash Paid:"+price);
	}

	public void doDelivery() {
		System.out.println("Product Collected from counter");
		
	}

}
