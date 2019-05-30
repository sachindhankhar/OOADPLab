package q9_template;

import java.util.HashMap;

public class Items {
	
	HashMap<String,Integer> item=new HashMap<>();
	Items(){
		item.put("bat",2000);
		item.put("bowl",150);
		item.put("wickets",200);
	}
	HashMap<String,Integer> getItem(){
		return this.item;
	}
}
