public class RunnableDemo implements Runnable{
	public void run(){
		for(int i = 0; i< 10;i++){
			System.out.println(" Message " + i);
		}
	}
	public static void main(String[] args){
		RunnableDemo r = new RunnableDemo();
		Thread t = new Thread(r);
		t.start();
	}
	
}