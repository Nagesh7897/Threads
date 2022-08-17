package type;

class TestPriority extends Thread
{
	
}


public class PriorityTest extends Thread {

	public static void main(String[] args) {
	
		Thread t1= new Thread();
		t1.setPriority(6);
		
		int holdPri=t1.getPriority();
		System.out.println(holdPri);

		PriorityTest priority=new PriorityTest();   //Main Class object
		TestPriority testPriority=new TestPriority();
		System.out.println("For main class priority = "+priority.getPriority());
		testPriority.setPriority(Thread.MAX_PRIORITY);
		System.out.println("High Priority = "+testPriority.getPriority());
	}  // high Priority-10; normal priority-5;  Low Priority-1

}
