package taskAllConcept;


class First extends Thread{                     //join
	public void run() {
		for(int i=0; i<5;i++) {
			try {
			Thread.sleep(1000);
			System.out.println("From First Class "+ (i+1) );
			}
			catch (InterruptedException e) {
			System.out.println(e);
		}	
	}
	}
}

class Second extends Thread{                           //join
	public void run() {
		for(int i=0; i<5;i++) {
			try {
			Thread.sleep(500);
			System.out.println("From Second Class "+ (i+1) );
			}
			catch (InterruptedException e) {
			System.out.println(e);
		}	
	}
	}
}
class Third extends Thread{                    // daemon thread
	public void run() {
		while(true) {
			try {
			Thread.sleep(2500);
			System.out.println("From Third Class-Daemon Thread");
			}
			catch (InterruptedException e) {
			System.out.println(e);
		}	
	}
	}
}

class Fifth extends Thread{                           //Priority set
	public void run() {
		for(int i=0; i<5;i++) {
			try {
			Thread.sleep(2500);
			System.out.println("From Fifth Class "+ (i+1) );
			}
			catch (InterruptedException e) {
			System.out.println(e);
			continue;
		}	
	}
	}
}

public class Task extends Thread {

	public static void main(String[] args) {                      //main class
    
		Thread forth=new Thread(new Runnable() {
			@Override
			public void run() {
				int a=5;
				while(a>0)
				{
					System.out.println("Main from forth class = "+a--);
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		try {
		 First first=new First();
		 Second second= new Second();
		 Third third= new Third();
		 Fifth fifth=new Fifth();
		 
		 first.start();
		 first.join();
		
		second.start();
		second.join();
		
		third.setDaemon(true);
		third.start();
		
		forth.start();
		
		fifth.setPriority(4);
		fifth.start();
		}
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
