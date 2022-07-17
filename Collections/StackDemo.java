import java.util.Stack;

import java.util.ListIterator;



public class StackDemo{
	
	public static void main(String[] args){
		 Stack s = new Stack();
		 
		 s.push(100);
		 s.push(200);
		 s.push(300);
		 s.push(400);
		 s.push(500);
		 
		 System.out.println("Stack :::: "+ s);
		 
		 System.out.println("Poped Element ::: "+s.pop());
		 
		 System.out.println("After Poped Stack :::: "+s);
		 
		 System.out.println("Peek Element ::: "+s.peek());
		 
		 System.out.println("After Peek Element Stack :::: "+s);

		
	}
	
}