package q4_bridge;

public class Senior implements CustomerType{
	DiscountType dt;
	Senior(DiscountType dt){
		this.dt=dt;
	}
	public Double getDiscount() {
		return this.dt.getDiscount();
	}

}