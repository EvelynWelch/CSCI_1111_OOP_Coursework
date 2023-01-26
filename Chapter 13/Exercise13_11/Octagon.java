// Author: Evie Welch
// Date: 25/01/23

public class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double side4 = 1.0;
	private double side5 = 1.0;
	private double side6 = 1.0;
	private double side7 = 1.0;
	private double side8 = 1.0;
	
	public Octagon() {}
	
	public Octagon(double side1, double side2, double side3, double side4,double side5, double side6,double side7,double side8) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
		this.side7 = side7;
		this.side8 = side8;
	}
	
	public Octagon(double side1, double side2, double side3, double side4,double side5, double side6,double side7,double side8, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
		this.side7 = side7;
		this.side8 = side8;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getSide4() {
		return side4;
	}
	public double getSide5() {
		return side5;
	}
	public double getSide6() {
		return side6;
	}
	public double getSide7() {
		return side7;
	}
	public double getSide8() {
		return side8;
	}
	public void setSide1(double side) {
		side1 = side;
	}
	public void setSide2(double side) {
		side2 = side;
	}
	public void setSide3(double side) {
		side3 = side;
	}
	public void setSide4(double side) {
		side4 = side;
	}
	public void setSide5(double side) {
		side5 = side;
	}
	public void setSide6(double side) {
		side6 = side;
	}
	public void setSide7(double side) {
		side7 = side;
	}
	public void setSide8(double side) {
		side8 = side;
	}
	
	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2) * getSide1() * getSide1()));
	}
	@Override
	public double getPerimeter() {
		return getSide1() * 8;
	}
	
	@Override
	public Object clone() {
		try {
			return (Octagon)super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	@Override
	public int compareTo(GeometricObject o) {
		double a = getArea();
		double oa = o.getArea();
		if(a > oa) {
			return 1;
		} else if(a < oa) {
			return -1;
		} else {
			return 0;
		}

	}
	 
}
