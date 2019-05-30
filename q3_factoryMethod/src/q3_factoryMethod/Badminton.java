package q3_factoryMethod;

import java.util.HashMap;

public class Badminton implements IProductType{
	String racket="Yonex";
	Double price=5000.02;
	HashMap<String,Double> hm=new HashMap<>();
	public HashMap<String,Double> giveItem(){
		hm.put(racket,price);
		return hm;
	}
}
