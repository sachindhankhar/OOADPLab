package q9_template;

public abstract class Payment {
	public void paymentProcess() {
		this.selectitem();
		this.doPayment();
		this.doDelivery();
	}
	public abstract void selectitem();
	public abstract void doPayment();
	public abstract void doDelivery();
}
