import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;


public class LinkedHashMapDemo{
	
	public static void main(String[] args){
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
		hm.put(1,"abcd");
		hm.put(2,"xyz");
		hm.put(5,"rtu");
		hm.put(3,"lmn");
		hm.put(4,"opq");
		
		System.out.println("::: Linked HASH MAP ::: " + hm);
		
		System.out.println("::: Getting Value ::: " + hm.get(3));
		
		hm.remove(4);
		
		System.out.println("::: After Removed 4 ::: " + hm);
		
		Set s = hm.keySet();
		
		System.out.println("::: Key Set ::: " + s);
		
		Iterator i = s.iterator();
		
		while(i.hasNext()){
			System.out.println("::: Value ::: " + hm.get(i.next()));
		}
		
		hm.clear();
		
		System.out.println("::: clear LinkedHashMap ::: " + hm);
	}
	
	
	
}