package q2_strategy;

public class StoreLevel implements IDiscountType{
	Double previousDaySale=100.0;
	public Double calculateDiscount() {
		return previousDaySale*0.05;
	}
}
