import java.util.HashSet;
import java.util.Iterator;

public class SetDemo{

public static void main(String[] args){
 
		HashSet hs = new HashSet();
		
		hs.add("Asus");
		hs.add("Samsung");
		hs.add("Apple");
		hs.add("Sony");
		hs.add("Sigami");
		hs.add("Philips");
		hs.add("Sony");
		
		System.out.println("HashSet :::: "+ hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println("Iterated Value :::: "+ it.next());
		}
		
		System.out.println("Emptying the Set :::: ");
		hs.clear();
		System.out.println("HashSet :::: "+ hs);
		

		
}	
	
	
	
}