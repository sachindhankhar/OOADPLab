package q1_adapter;

public class MauriTax {
	Double amount;
	MauriTax(Double inc){
		this.amount=inc;
	}
	public String calculateTax() {
		if(this.amount<10000) {
			return Double.toString(amount*0.2);
		}else if(this.amount>=100000 && this.amount<1000000) {
			return Double.toString(amount*0.5);
		}else {
			return Double.toString(amount*0.15);
		}
	}
}
