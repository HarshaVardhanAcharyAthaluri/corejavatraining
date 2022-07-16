import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Asus");
		al.add("Samsung");
		al.add("Apple");
		al.add("Sony");
		al.add("Sigami");
		al.add("Philips");
		al.add("Sony");
			
		//Iterating with for loop
		for(int i=0;i<al.size();i++){
		System.out.println(al.get(i));
		}
		
		//Iterating with for each
		for(Object el:al){
			System.out.println(el.toString());
		}
		
		System.out.println("Before Removing :::::: "+ al.size());
		System.out.println("Removeing value");
		al.remove(2);
		al.remove("Sigami");
		System.out.println("After Removing :::::: "+ al.size());
		System.out.println("After Set  :::::: ");
		
		al.set(1,"BlackBerry"); // Replace
		System.out.println(":: SET :: at Index 1 ");
		for(Object el:al){
			System.out.println(el.toString());
		}
		
		al.add(2,"One Plus One");
		System.out.println(":: Add :: at Index 2 ");
		for(Object el:al){
			System.out.println(el.toString());
		}
		
		al.add("Boat");
		
		System.out.println(":: Added Boat  ::");
		for(Object el:al){
			System.out.println(el.toString());
		}
		
		System.out.println("========REMOVING WITH INDEX ===========");
		al.remove(3);
		for(Object el:al){
			System.out.println(el.toString());
		}
		System.out.println("========Iterating with Iterator ===========");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("========Befor Clearing ==========="+ al.size());
		al.clear();
		System.out.println("========After Clearing ==========="+al.size());
		
		
		
	}
	
	
	
}