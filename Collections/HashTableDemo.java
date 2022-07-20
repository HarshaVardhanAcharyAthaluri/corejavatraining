import java.util.Hashtable;
import java.util.Set;
import java.util.Enumeration;

public class HashTableDemo{
	public static void main(String[] args){
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		ht.put("agent1","Harsha");
		ht.put("agent7","Mounika");
		ht.put("agent2","Sai");
		ht.put("agent3","Mohith");
		
		
		System.out.println("::: Hashtable ::: " + ht);
		
		System.out.println("::: Getting Value ::: " + ht.get("agent2"));
		
		ht.remove("agent1");
		
		System.out.println("::: After Removed 1 ::: " + ht);
		
		Enumeration e = ht.keys();
		
		while(e.hasMoreElements()){
			System.out.println("::: Value ::: " + ht.get(e.nextElement()));
		}
		
		
		
		
	}
	
	
	
	
}