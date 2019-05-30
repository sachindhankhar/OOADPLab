package q8_decorator;

import java.util.HashMap;

public abstract class Decorator implements Sports{
	public abstract HashMap<String,Integer> getStock(String sport);
}
