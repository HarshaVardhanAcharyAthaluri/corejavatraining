public class MultipleThreadDemo implements Runnable{
	String name;
	
	MultipleThreadDemo(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i = 0; i< 10;i++){
			System.out.println(" Message " + i + " from "+ name);
		}
	}
	
	public static void main(String[] args){
		
		MultipleThreadDemo m1 = new MultipleThreadDemo("Thread One");
		MultipleThreadDemo m2 = new MultipleThreadDemo("Thread Two");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
		
		
	}
	
	
}