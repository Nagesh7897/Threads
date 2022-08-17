package type;

	class intru implements Runnable
	{
		public void run() {
			for(int i=0; i<5;i++) {
				try {
				Thread.sleep(2500);
				System.out.println("From intru Class "+ (i+1) );
				}
				catch (InterruptedException e) {
				System.out.println("I am stoping");
				continue;
			}	
		}
		}
	}


public class ThreadIntrrupt {

	public static void main(String[] args) {
		intru inte=new intru();
		Thread thread=new Thread(inte);
		thread.start();
		
		try {
			Thread.sleep(5000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("Will I Call?");
		}
		

	}

}
