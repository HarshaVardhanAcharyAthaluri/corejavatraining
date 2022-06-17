class Sample extends Demo{	
	int a = 33;
	int b = 70;
	void m1(){
		System.out.println("Sample Class m2");
	}
	
	void show(){
		int a = 44;
		Test t = new Test();
		System.out.println(t.a); // test object
		System.out.println(a); // local value
		System.out.println(this.a); // instance value of current class	
		System.out.println(super.a); // immediate parent class value		
	}
	public static void main(String[] args){
		Sample  s = new Sample();
		s.show();
		
	}
}