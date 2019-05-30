package q4_bridge;

public class Regular implements CustomerType{

	DiscountType dt;
	Regular(DiscountType dt){
		this.dt=dt;
	}
	public Double getDiscount() {
		return this.dt.getDiscount();
	}
}
