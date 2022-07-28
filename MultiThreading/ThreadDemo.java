public class ThreadDemo extends Thread{
	public void run(){
		for(int i = 0; i< 10;i++){
			System.out.println(" Message " + i);
		}
	}
	
	public static void main(String[] args){
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		td.start();
	}
}