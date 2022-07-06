public class FinallyDemo {
	
	public static void main(String[] args) {
		System.out.println("------- Statement1 -------");
		
		System.out.println("------- Statement2 -------");
		
		int a[] = new int[2];
	
		try{
		System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}finally{
			System.out.println("finally Block");
		}
		
		System.out.println("-------------- Statement 4 -------------");
		
		System.out.println("-------------- Statement 5 -------------");
		
	}

}