import java.util.*;

public class StudentSort implements Comparator<Student>{
	
	public int compare(Student s1,Student s2){
		return s1.rollNo - s2.rollNo;
	}
}