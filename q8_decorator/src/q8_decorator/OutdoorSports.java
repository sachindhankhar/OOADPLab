package q8_decorator;

import java.util.HashMap;

public class OutdoorSports implements Sports{
	HashMap<String,Integer> trekking=new HashMap<>();
	HashMap<String,Integer> paraGliding=new HashMap<>();
	HashMap<String,Integer> cricket=new HashMap<>();
	HashMap<String,Integer> footBall=new HashMap<>();
	HashMap<String,Integer> running=new HashMap<>();
	HashMap<String,Integer> highJump=new HashMap<>();
	
	OutdoorSports(){
		trekking.put("trekkingShoes",10);
		trekking.put("trekkingTorch",20);
		paraGliding.put("parachute",15);
		paraGliding.put("gps",18);
		cricket.put("bat",11);
		cricket.put("ball",15);
		footBall.put("footBall",14);
		footBall.put("footBallShoes",10);
		running.put("runningShoes",4);
		running.put("runningTShirt",8);
		highJump.put("mat",12);
		highJump.put("stand",19);
	}
	public HashMap<String,Integer> getStock(String s) {
		HashMap<String,Integer> mp=null;
		if(s.equals("trekking")) mp=this.trekking;
		else if(s.equals("paraGliding")) mp=this.paraGliding;
		else if(s.equals("cricket")) mp=this.cricket;
		else if(s.equals("footBall")) mp=this.footBall;
		else if(s.equals("running")) mp=this.running;
		else if(s.equals("highJump")) mp=this.highJump;
		return mp;
	}
}
