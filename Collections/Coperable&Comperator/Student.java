import java.util.*;

public class Student implements Comparable{
	
	public int rollNo;
	public String name;
	
	public Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
		
	}
	
	public void dislpayStudentDetails(){
		System.out.println("Student rollNo "+ rollNo + " with name "+ name + " attended class today");
	}
	
	public int compareTo(Object o){
		Student s = (Student)o;
		if(this.rollNo<s.rollNo)
			return -12;
		else
			return 0;
	}
	
}