package collectionOfThread;

import java.util.Set;

public class ThreadCollection {

	public static void main(String[] args) {
		
		Set<Thread> set=Thread.getAllStackTraces().keySet();
		
		for(Thread th:set)
		{
			String name=th.getName();
			Thread.State state=th.getState();
			int pri=th.getPriority();
			boolean test=th.isDaemon();
			
			String msg=test?"Demon":"Normal";
			System.out.printf("%-15s \t %s \t %d \t %s \n", name,state,pri,msg);
		}

	}

}
