package q3_factoryMethod;

public class Senior {
	public Double getDiscount() {
		IDiscountType dis=new Discount15();
		return dis.calculateDiscount();
	}
}
