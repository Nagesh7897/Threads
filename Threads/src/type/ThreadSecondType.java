package type;


class Second implements Runnable{

	@Override
	public void run() {
		System.out.println(" Thread Second method by implementing Runnable interface");	
	}
	
}



public class ThreadSecondType {

	public static void main(String[] args) {
		
		Second second=new Second();
		Thread thread=new Thread(second);
		thread.start();
	}
}
