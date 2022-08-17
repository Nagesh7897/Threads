package starvationDeadlock;

public class Police {
 boolean moneysent=false;
 
 public void giveRansom(Criminal criminal)
 {
	 while(!criminal.isHostageFree())
	 {
		 System.out.println("Policewaioting for criminal to realse hostage");
	 
	 try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	 }
	 System.out.println("Police:sent money");
	  this.moneysent=true;
 }
 
 
	public boolean isMoneyGiven() {
		
		return this.moneysent;
	}

}
