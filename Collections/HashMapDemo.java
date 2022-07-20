import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapDemo{
	public static void main(String[] args){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"abcd");
		hm.put(2,"xyz");
		hm.put(3,"lmn");
		hm.put(4,"opq");
		hm.put(5,"rtu");
		
		System.out.println("::: HASH MAP ::: " + hm);
		
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
		
		System.out.println("::: clear HashMap ::: " + hm);
	}
}