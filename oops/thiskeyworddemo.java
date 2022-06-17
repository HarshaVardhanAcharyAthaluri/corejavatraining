class Main{
	int a = 10;
	void display(){
		int a = 50;
		System.out.println(this.a);
	}
	public static void main(String[] args){
		  Main m = new Main();
		  m.display();
	}	
}