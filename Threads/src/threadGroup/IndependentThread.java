package threadGroup;

public class IndependentThread extends Thread{
public IndependentThread(ThreadGroup group, String name) {
	super(group,name);
}

public void run()
{
	boolean test=true;
	while(test)
	{
		try {
			Thread.sleep(2000);
			System.out.println(getName()+ "is up now");
		} catch (InterruptedException e) {
			test=false;
			System.out.println(getName()+ "is down now and interrupted");
		}
	}
}
}
