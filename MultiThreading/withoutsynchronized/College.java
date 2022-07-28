public class College implements Runnable{
	int seats;
	College(int seats){
		this.seats = seats;
	}

	public  void run(){
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " no of seats before allotment ::: "+ seats);
		
		if(seats>0){
			try{
			Thread.sleep(2000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.println("Seat alloted to ::: " + name);
			
			seats = seats-1;
		}else{
			System.out.println("Seat not alloted to ::: " + name);
		}
		
		System.out.println(name + " no of seats After allotment ::: "+ seats);
	}


}