public class Allotment{
	public static void main(String[] args){
		College c = new College(1);
		
		Thread t1 = new Thread(c);
		t1.setName("Student 1");
		
		Thread t2 = new Thread(c);
		t2.setName("Student 2");
		
		t1.start();
		t2.start();
		
		
		
	}
	
}