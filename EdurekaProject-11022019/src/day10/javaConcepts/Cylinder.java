package day10.javaConcepts;

public class Cylinder extends Shape {

	@Override
	public double calculateAreaOfBase(int side) {
		
		double area = Math.PI * side * side;
		return area;
	}

}
