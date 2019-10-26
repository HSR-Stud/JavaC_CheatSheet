public class Vehicle extends Object{	// Implizites Erben von Root-Klasse
	private int speed;
	
	public Vehicle(){
		super();	// impliziter Aufruf
		speed = 0;
	}
}

public class Car extends Vehicle{
	private boolean[] isDoorOpen;
	
	public Car(){	// Impliziter Default-Konstruktor
		super();	// Impliziter Aufruf
	}
}

// Alles was implizit passiert, wird vom Compiler ergaenzt