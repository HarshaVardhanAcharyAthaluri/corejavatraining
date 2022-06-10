class Student{
	int roll = 123; // instance variables
	String name = "Sai";
	double marks = 54.23;
	
	
	String displayDetails(String usr){
		name = "Harsha";
		String msg = "its seceret"; // localvariables
		return "Hello Student: "+ usr + " you got a "+ msg;
	}
	
	public static void main(String[] args){
		Student st = new Student();
		System.out.println("Roll Number: "+st.roll);
		System.out.println("Name of student: "+st.name);
		System.out.println(st.displayDetails("Demo"));
		System.out.println("Name of student after methode call: "+st.name);
	
		
	}
}