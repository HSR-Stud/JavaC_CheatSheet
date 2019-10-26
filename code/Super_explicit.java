public class Vehicle{
	private int speed;
	
	public Vehicle(int speed){
		this.speed = speed;
	}
}

public class Car extends Vehicle{
	private boolean[] isDoorOpen;
	
	public Car(int speed, int nofDoors){
		super(speed);	// expliziter Aufruf
		isDoorOpen = new boolean[nofDoors];
	}
}