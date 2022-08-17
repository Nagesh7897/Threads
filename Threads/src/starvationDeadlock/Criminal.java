package starvationDeadlock;

public class Criminal {
	
	boolean hostageRelease=false;
	
	public void releaseHostage(Police police)
	{
		while(!police.isMoneyGiven())
		{
			System.out.println("Criminal:waiting police to give money");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		}
		System.out.println("Hostage is free");
		this.hostageRelease=true;
	}
	
	public boolean isHostageFree() {
		return this.hostageRelease;
	}

}
