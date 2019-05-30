package q5_observer;

import java.util.ArrayList;

public class FestivalDiscount implements IObservable{
	
	String msg="Diwali Sale , shoes:20% off!";
	ArrayList<IObserver> observers=new ArrayList<>();
	public void add(IObserver ob) {
		observers.add(ob);
		
	}

	public void notifyCustomer() {
		for(IObserver obs:observers) {
			obs.update();
		}
		
	}
	public String offer() {
		return msg;
	}

}
