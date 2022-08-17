package starvationDeadlock;

public class LiveLockImpl {

	static final Police police=new Police();
	static final Criminal criminal=new Criminal();
	
	public static void main(String[] args) {
		
		Thread thread= new Thread(new Runnable() {
			
			@Override
			public void run() {
				police.giveRansom(criminal);
				
			}
		});
		thread.start();
		
        Thread thread1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				criminal.releaseHostage(police);
				
			}
		});
		thread1.start();
		
		
		
	}

}
