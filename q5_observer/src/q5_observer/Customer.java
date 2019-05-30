package q5_observer;

public class Customer implements IObserver{
	
	String name,phone;
	IObservable ob;
	Customer(IObservable ob,String name,String phone){
		this.ob=ob;
		this.name=name;
		this.phone=phone;
	}
	public void update() {
		String offer=this.ob.offer();
		System.out.println("New offer!"+offer);
		
	}

}
