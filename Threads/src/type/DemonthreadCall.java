package type;

public class DemonthreadCall {

	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi");
				
			}
		});
		 
		thread.setDaemon(true);
		thread.start();
		System.out.println(thread.getPriority());
	}

}
