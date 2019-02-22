package day10.javaConcepts;

public class DemoShape {

	public static void main(String[] args) {
	
		Cylinder cyl = new Cylinder();
		
		Shape cuboid = new Cuboid();
		
		double cylVol = cyl.calculateVolume(10, 10);
		
		double cuboidVol = cuboid.calculateVolume(10, 10);
		
		System.out.println("Volume of cylnder : "+ cylVol);
		
		System.out.println("Volume of Cuboid : "+ cuboidVol);
	}

}
