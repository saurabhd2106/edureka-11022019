package day8.javaTopics;

public class DemoCar {

	public static void main(String[] args) {

		Vehicle mac = new Vehicle(); //It will call constructor of parent only

		mac.engineSize = 9000;
		mac.start();

		mac.stop();

		System.out.println("------------------------------------------");

		Car fordFigo = new Car(); //It will call constructor of both parent and child (in same order)

		fordFigo.start();

		fordFigo.stop();

		fordFigo.accelerate();
		

		System.out.println("------------------------------------------");
		
		Vehicle i20 = new Car(); //It will call constructor of both parent and child (in same order)

		i20.start();

	}

}
