public class Student{
	
	private int rollNo;
	private String name;
	
	public Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
		
	}
	
	public void dislpayStudentDetails(){
		System.out.println("Student rollNo "+ rollNo + " with name "+ name + " attended class today");
	}
	
	
	
}