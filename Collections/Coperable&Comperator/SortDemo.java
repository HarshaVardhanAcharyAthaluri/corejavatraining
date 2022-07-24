import java.util.*;

public class SortDemo{
	public static void main(String[] args){
		ArrayList l = new ArrayList();
	Student s = new Student(1,"Joe Tribiani");
	Student s1 = new Student(2,"Chandler");
	Student s2 = new Student(3,"Monika");
	Student s3 = new Student(4,"PheyBe Buffey");
	Student s4 = new Student(5,"Ross");
	Student s5 = new Student(6,"Rechal");
	
	l.add(s);
	l.add(s2);
	l.add(s5);
	l.add(s1);
	l.add(s3);
	l.add(s4);
	
	Iterator i = l.	iterator();
	
	while(i.hasNext()){
		Student std = (Student)i.next();
		System.out.println(std.rollNo + " ::: " + std.name);
	}
	
	
	
	System.out.println("Sort Based on Roll Number");
	Collections.sort(l,new StudentSort());
	Iterator i1 = l.iterator();
	while(i1.hasNext()){
		Student std = (Student)i1.next();
		System.out.println(std.rollNo + " ::: " + std.name);
	}
	
	
	System.out.println("Sort Based on Name");
	Collections.sort(l,new SortStudentName());
	Iterator i2 = l.iterator();
	while(i2.hasNext()){
		Student std = (Student)i2.next();
		System.out.println(std.rollNo + " ::: " + std.name);
	}

	}
}