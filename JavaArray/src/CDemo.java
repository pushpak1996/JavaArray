import java.util.ArrayList;

public class CDemo {

	public static void main(String[] args) {
	
		ArrayList<Player> pList=new ArrayList<Player>();
		
		Player p1=new Player();
		p1.Name="Virat";
		p1.Hscore=80;
		p1.Country="IND";		
		p1.Age=28;
		p1.Rank=2;
		
		Player p2=new Player();
		p2.Name="Sachin";
		p2.Hscore=90;
		p2.Country="IND";		
		p2.Age=38;
		p2.Rank=3;
		
		Player p3=new Player();
		p3.Name="Ricky";
		p3.Hscore=85;
		p3.Country="AUS";		
		p3.Age=35;
		p3.Rank=4;
		
		System.out.println("Player List Size: "+pList.size());
		pList.add(p1);
		System.out.println("Player List Size: "+pList.size());
		pList.add(p2);
		System.out.println("Player List Size: "+pList.size());
		pList.add(p3);
		System.out.println("Player List Size: "+pList.size());
		
		for (Player play:pList) {   //for Each loop : for(Classname play:pList)
		System.out.println(play.Name);
		System.out.println(play.Hscore);
		
		}
		
}
}