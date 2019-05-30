package q4_bridge;

public class MainClass {
	public static void main(String[] args) {
		CustomerType ct=new Senior(new Discount20());
		System.out.println(ct.getDiscount());
		CustomerType ct1=new Senior(new Discount15());
		System.out.println(ct1.getDiscount());
	}
}
