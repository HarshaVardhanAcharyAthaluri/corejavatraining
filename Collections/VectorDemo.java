import java.util.Vector;

import java.util.ListIterator;



public class VectorDemo{
	
	public static void main(String[] args){
		Vector v = new Vector();
		
		v.add(new Student(1,"SAI"));
		v.add(new Student(2,"SPANDANA"));
		v.add(new Student(3,"MOUNIKA"));

		System.out.println("Vector :::: "+ v);

		ListIterator li   = v.listIterator();
		
		while(li.hasNext()){
			Student s = (Student)li.next();
			s.dislpayStudentDetails();
		}


		
	}
	
}