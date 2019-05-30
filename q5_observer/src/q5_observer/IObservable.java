package q5_observer;

public interface IObservable {
	void add(IObserver ob);
	void notifyCustomer();
	String offer();
}
