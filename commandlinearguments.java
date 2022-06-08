import java.io.*;
class CommandLineArguments{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter No1: ");
		String no1 = br.readLine();
		int a = Integer.parseInt(no1);
		
		System.out.print("Enter No2: ");
		String no2 = br.readLine();
		int b = Integer.parseInt(no2);
		
		int result = a+b;
		
		System.out.println("Result :"+ result);
		
	}
	
}