package deadLock;

public class SoftwareCompany {

	private Object l1=new Object();
	private Object l2=new Object();
	
	public void first()
	{
		synchronized (l1) {
			synchronized (l2) {
				System.out.println("First");
			}
			
		}
	}
	
	public void second()
	{
		synchronized (l2) {
			synchronized (l1) {
				System.out.println("Second");
			}
			
		}
	}
	
	
}
