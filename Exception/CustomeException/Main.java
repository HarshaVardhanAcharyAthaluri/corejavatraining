public class Main {
	
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		
		if(age<18){
			int temp = 18-age;
			throw new AdultException("Wait for "+ temp + " years to get access");
		}else{
			System.out.println("You are Authorized");
		}
	
		
	}

}