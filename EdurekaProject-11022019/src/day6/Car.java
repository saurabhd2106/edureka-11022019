package day6;

public class Car extends Vehicle{
	
	
	int numberOfGears;
	
	public Car() {
		
		super(1000);
		System.out.println("I am a constructor from Car class");
	}
	
	public void accelerate(){
		
		start();
		
		engineSize = 1000;
		
		System.out.println("Accelerate from Car class");
	}
	
	public void changeGear(){
		System.out.println("Changing gear");
	}

}
