import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;


public class TreeMapDemo{
	public static void main(String[] args){
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		tm.put("agent1","Harsha");
		tm.put("agent7","Mounika");
		tm.put("agent2","Sai");
		tm.put("agent3","Mohith");
		
		
		System.out.println("::: Tree Map ::: " + tm);
		
		System.out.println("::: Getting Value ::: " + tm.get("agent2"));
		
		tm.remove("agent1");
		
		System.out.println("::: After Removed 1 ::: " + tm);
		
		Set s = tm.keySet();
		
		System.out.println("::: Key Set ::: " + s);
		
		Iterator i = s.iterator();
		
		while(i.hasNext()){
			System.out.println("::: Value ::: " + tm.get(i.next()));
		}
		
		tm.clear();
		
		System.out.println("::: clear TreeMap ::: " + tm);
		
	}
	
	
}