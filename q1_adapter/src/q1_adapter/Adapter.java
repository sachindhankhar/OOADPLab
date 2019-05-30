package q1_adapter;

public class Adapter implements ITarget{
	MauriTax mt;
	Adapter(MauriTax m){
		this.mt=m;
	}
	public Double calculateTax() {
		return Double.parseDouble(this.mt.calculateTax());
	}
}
