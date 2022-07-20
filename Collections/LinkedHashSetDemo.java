import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo{

public static void main(String[] args){
	 LinkedHashSet ls = new  LinkedHashSet();
	 
		ls.add("Asus");
		ls.add("Samsung");
		ls.add("Apple");
		ls.add("Sony");
		ls.add("Sigami");
		ls.add("Philips");
		ls.add("Sony");
		
		System.out.println("LinkedHashSet :::: "+ ls);
		
		Iterator it = ls.iterator();
		
		while(it.hasNext()){
			System.out.println("Iterated Value :::: "+ it.next());
		}
		
		System.out.println("Emptying the Set :::: ");
		ls.clear();
		System.out.println("LinkedHashSet :::: "+ ls);
}	
	
	
}