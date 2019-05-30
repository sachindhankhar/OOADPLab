package q9_template;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Enter 1 for online payment, 2 for offline");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		Payment p;
		if(ch==1) {
			p=new OnlineMode(new Items());
		}else {
			p=new OfflineMode(new Items());
		}
		p.paymentProcess();
		sc.close();
	}
}
