public class DemoException {
	
	public static void main(String[] args) {
		System.out.println("------- Statement1 -------");
		
		System.out.println("------- Statement2 -------");
		try{
		System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}catch(ArithmeticException exception){
			exception.printStackTrace();
		}
		System.out.println("-------------- Statement 4 -------------");
		
		System.out.println("-------------- Statement 5 -------------");
		
		
	}

}