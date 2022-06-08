class Numbers{
	public static void main(String[] args){
		Integer marks = Integer.parseInt(args[0]);
		
		switch(marks){
			case marks>50 : System.out.println("Grade A");
			         break;
			case 20 : System.out.println("Grade B");
			         break;
			default: System.out.println("Grade SOmething");		 
		}
	}
}
