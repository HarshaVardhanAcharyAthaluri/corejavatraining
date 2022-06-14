class ConstructorDemo{
	ConstructorDemo(){
		System.out.println("Object creation ::::: with Default Constructo");
	}
	
	ConstructorDemo(String user){
		System.out.println("Object creation ::::: "+ user);
	}
	
	public static void main(String[] args){
		new ConstructorDemo();
		new ConstructorDemo("demouser");
	}
	
	
}