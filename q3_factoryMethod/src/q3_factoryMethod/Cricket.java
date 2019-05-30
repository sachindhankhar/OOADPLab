package q3_factoryMethod;

import java.util.HashMap;

public class Cricket implements IProductType{
	String bat="SS";
	Double price=2500.0;
	HashMap<String,Double> hm=new HashMap<>();
	public HashMap<String,Double> giveItem(){
		hm.put(bat,price);
		return hm;
	}
}
