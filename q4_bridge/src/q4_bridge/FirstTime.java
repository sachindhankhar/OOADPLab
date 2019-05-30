package q4_bridge;

public class FirstTime implements CustomerType{
	
	DiscountType dt;
	FirstTime(DiscountType dt){
		this.dt=dt;
	}
	public Double getDiscount() {
		return this.dt.getDiscount();
	}
}
