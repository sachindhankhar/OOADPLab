package q8_decorator;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Sports sp;
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> sport=new HashMap<>();
		HashMap<Integer,String> choice=new HashMap<>();
		choice.put(1,"GamesOnTable");
		choice.put(2,"BoardGames");
		choice.put(3,"CourtGames");
		choice.put(4,"AdventureGames");
		choice.put(5,"StadiumGames");
		choice.put(6,"Athletics");
		
	
		NewClassification nc;
		while(true) {
			System.out.println("Choose sports 1 for Indoor, 2 for outdoor ");
			int ch=sc.nextInt();
			if(ch==1) {
				sp=new IndoorSports();
				nc=new NewClassification(sp);
				System.out.println("Choose sports type");
				System.out.println("1 for GamesOnTable");
				System.out.println("2 for BoardGames");
				System.out.println("3 for CourtGames");
			}else {
				 sp=new OutdoorSports();
				 nc=new NewClassification(sp);
				 System.out.println("Choose sports type");
				 System.out.println("4 for AdventureGames");
					System.out.println("5 for StadiumGames");
					System.out.println("6 for Athletics");
			}
			
			System.out.println("-1 to exit");
			ch=sc.nextInt();
			if(-1==ch) break;
			sport=nc.getStock(choice.get(ch));
			for(String s:sport.keySet()) {
				System.out.println("Item->"+s+"\tStock->"+sport.get(s));
			}
		}
		sc.close();
	}
}
