package day6;

public class Vehicle {

	public Vehicle(int engineSize) {

		this.engineSize = engineSize;
		System.out.println("I am constructor from Vehicle class");
	}

	int engineSize;

	public void start() {
		System.out.println("Start from vehicle");
	}

	public void stop() {
		System.out.println("Stop from vehicle");
	}

}
