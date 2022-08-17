package testDemon;

public class ThreadTestDemon {

	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				int a=10;
				while(a>0)
				{
					System.out.println("User Thread = "+a--);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();             //call started
		
	Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				{
					System.out.println("Demon Thread is Running");
					try {
						Thread.sleep(500);                      //  It need to run infinite but becouse of demon thread it will run till other main thread compltion
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
			}
		});
	
	thread2.setDaemon(true);
	thread2.start();
	
		

	}

}
