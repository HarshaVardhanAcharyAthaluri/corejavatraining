import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo{
	
	public static void main(String[] args){
		
		LinkedList l = new LinkedList();
		
		l.add("Dell");
		l.add("Lenovo");
		l.add("HP");
		l.add("Sony");
		l.add("MSI");
		l.add("MAC");
		
		System.out.println("List:::: "+ l);
		
		System.out.println("List SIZE :::: "+ l.size());
		l.remove(4);
		System.out.println("List After Remove 4th Index :::: "+ l);
		
		Iterator i = l.iterator();
		
		while(i.hasNext()){
				System.out.println("Value:::: "+ i.next());
		}
		

		
	}
	
	
}