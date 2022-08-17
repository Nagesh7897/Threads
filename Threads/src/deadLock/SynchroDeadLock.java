package deadLock;

public class SynchroDeadLock {

	public static void main(String[] args) {
		
		SoftwareCompany company=new SoftwareCompany();
		for(int i=0;i<=10;i++) {
			
			Thread thread=new Thread(new Runnable() {
				
				@Override
				public void run() {
					company.first();
				}
			});
			thread.start();
		}
		
         for(int i=0;i<=10;i++) {
			
			Thread thread2=new Thread(new Runnable() {
				@Override
				public void run() {
					company.second();
				}
			});
			thread2.start();
		}
	}
}
