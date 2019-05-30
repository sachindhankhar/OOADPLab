package q3_factoryMethod;

public class Regular {
	public Double getDiscount() {
		IDiscountType dis=new Discount10();
		return dis.calculateDiscount();
	}
}
