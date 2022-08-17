package deadLock;

public class DeadLock {

	public static void main(String[] args) {
		SoftwareCompany company=new SoftwareCompany();
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				company.first();
			}
		});
		thread.start();
		
	Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				company.second();
			}
		});
	 thread2.start();
		

	}

}
