package day7.javaconcepts;

public class Shape {

	public double calculateArea(int side) {
		return side * side;
	}
	
	public double calculateArea(int len, int wid) {
		return len * wid;
	}
	
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

}
