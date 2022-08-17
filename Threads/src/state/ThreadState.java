package state;

public class ThreadState {

	public static void main(String[] args)throws InterruptedException  {
		
        Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
			Thread th =Thread.currentThread();
			System.out.println(th.getState());
				
			}
		});
        System.out.println(thread.getState());
        thread.start();
        thread.join();
        System.out.println(thread.getState());
	}

}
