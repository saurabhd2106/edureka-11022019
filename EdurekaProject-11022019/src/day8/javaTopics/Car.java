package day8.javaTopics;

public class Car extends Vehicle {

	private int numberOfGears;

	public Car() {

		System.out.println("I am a constructor from Car class");
	}

	public void accelerate() {

		numberOfGears = 4;
		System.out.println("Accelerate from Car class");
	}

	public void changeGear() {
		
		System.out.println("Changing gear");
	}
	
	public void start(){
		System.out.println("Start method of car class");
	}

}
