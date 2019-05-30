package q1_adapter;

import java.util.Scanner;

public class DecathlonPOS {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		Double amount=sc.nextDouble();
		ITarget target=new Adapter(new MauriTax(amount));
		System.out.println("Tax on amount: "+amount+" is: "+target.calculateTax());
		sc.close();
	}
}
