package Test;

import thiredmethod.Room3;

class House {
	
	public void Room1()
	{
		House house=new House();
		house.Room2();
		System.out.println("This is public calling Private method in the same class");
	}

	private void Room2()
	{
		System.out.println("This is private method");
	}
}


public class Mainroom1 {

	public static void main(String[] args) {
		
		House house= new House();
		house.Room1();
			
		Room2 room2= new Room2();
		room2.hall();
		
		Room3 room3= new Room3();
		room3.blanketroom();

	}

}


