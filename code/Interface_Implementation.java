class RegularCar implements Vehicle{
	...
	@Override
	public void drive(){
		System.out.println("driving...");
	}
	
	@Override
	public int maxSpeed(){
		return 120;
	}
	...
}