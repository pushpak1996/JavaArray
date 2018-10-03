import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> cHM=new HashMap<Integer,String>();
	
		    //(key,"value")
		cHM.put(1,"US");
		cHM.put(44,"UK");
		cHM.put(91,"IND");
		cHM.put(86,"CHINA");
		
		cHM.remove(44);
		cHM.putIfAbsent(44,"UK");
		
		for(Integer i:cHM.keySet()) {
			System.out.println(i);
			System.out.println(cHM.get(i));
			
		}
		
		System.out.println("-----------TREE MAP-----------");
		
		TreeMap<Integer,String> tHM=new TreeMap<Integer,String>();
		
	    //(key,"value")
	tHM.put(1,"US");
	tHM.put(44,"UK");
	tHM.put(91,"IND");
	tHM.put(86,"CHINA");
	tHM.put(52,"MEXICO");
	
	tHM.remove(44);
	tHM.putIfAbsent(44,"UK");
	
	for(Integer i:tHM.keySet()) {
		System.out.println(i+"-"+tHM.get(i));
		
	}
	
	System.out.println("-----------HASH SET-----------");
	
	HashSet<String> cHS=new HashSet<String>();
	
    	//(key,"value")
		cHS.add("US");
		cHS.add("UK");
		cHS.add("IND");
		cHS.add("CHINA");
		cHS.add("UK");    //adding duplicate value


System.out.println(cHS);
	
System.out.println("-------TREE SET-------");

TreeSet<String> ctS=new TreeSet<String>();

//(key,"value")
ctS.add("US");
ctS.add("UK");
ctS.add("IND");
ctS.add("CHINA");

ctS.add("UK");    //adding duplicate value

System.out.println(ctS);
	
}
}
