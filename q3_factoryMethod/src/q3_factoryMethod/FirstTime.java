package q3_factoryMethod;

public class FirstTime {
	public Double getDiscount() {
		IDiscountType dis=new Discount20();
		return dis.calculateDiscount();
	}
}
