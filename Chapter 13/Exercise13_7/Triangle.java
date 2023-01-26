// Author: Evie Welch
// date: 25/01/23

public class Triangle extends GeometricObject implements Colorable{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){}
	
	public Triangle(double side1, double side2,double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(double side1, double side2,double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	@Override
	public double getArea(){
		double s = getPerimeter();
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	@Override
	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side3) / 2;
	}
	@Override 
	public String toString() {
		String s = String.format("Triangle: %n side1: %f,%n side2: %f,%n side3: %f,%n %s", getSide1(), getSide2(), getSide3(), super.toString());
		return s;
	}
	@Override
	public void howToColor() {
		System.out.println("Color all three sides");
	}
}
