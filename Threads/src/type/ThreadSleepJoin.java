package type;


class FirstTest extends Thread
{
	public void run() {
		for(int i=0; i<5;i++) {
			try {
			Thread.sleep(2500);
			System.out.println("From First Class "+ (i+1));
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}	
	}
	}
}
		class SecondTest extends Thread
		{
			public void run() {
				for(int i=0; i<5;i++) {
					try {
					Thread.sleep(2500);
					System.out.println("From Second Class "+ (i+1));
					}
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}	
			}
			}
		}
			
				class ThirdTest extends Thread
				{
					public void run() {
						for(int i=0; i<5;i++) {
							try {
							Thread.sleep(2500);
							System.out.println("From Third Class "+ (i+1) );
							}
							catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						}	
					}
					}
				}


public  class ThreadSleepJoin {                                                   //Main Class

	public static void main(String[] args) {
		try {
		FirstTest first=new FirstTest();
		SecondTest second=new SecondTest();
		ThirdTest third=new ThirdTest();
		
		first.start();
		first.join();         //it will execute completely
		     
		second.start(); // second and third class both will run simultaneously
		third.start();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}
}

