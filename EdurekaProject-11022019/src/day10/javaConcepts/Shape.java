package day10.javaConcepts;

public abstract class Shape {

	public double calculateVolume(int side, int height) {
		return calculateAreaOfBase(side) * height;
	}

	public abstract double calculateAreaOfBase(int side);

}
