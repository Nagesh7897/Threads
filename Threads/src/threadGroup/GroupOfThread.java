package threadGroup;

public class GroupOfThread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup threadgroup=new ThreadGroup("A");
		ThreadGroup threadgroup1=new ThreadGroup("B");
		
		IndependentThread one= new IndependentThread(threadgroup, "A");
		one.start();
		IndependentThread two= new IndependentThread(threadgroup, "B");        //Providing different threads
		two.start();
		
		IndependentThread three=new IndependentThread(threadgroup1, "B");   //Different ObjectName
		three.start();
		Thread.sleep(10000);
		threadgroup.interrupt();
		threadgroup1.interrupt();
	}
}
