package type;

class First extends Thread{                         //class extending Thread
	public void run()
	{
		System.out.println(" Thread first method by extending Thread class");
	}
}

public class ThreadFirstType  {            //main class
	
	public static void main(String[] args) {
	
		 First first=new First();
		 first.start();
	}
}
