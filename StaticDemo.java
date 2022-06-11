class StaticDemo{
	 static String name = "demo user";
	 
	 static void demo(){
		 System.out.println("Hello");
	 }
	public static void main(String[] args){

		 System.out.println(StaticDemo.name);
		 
		 StaticDemo.demo();
	}
}