// author: Evie Welch
// date: 23/01/23

class Triangle extends GeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle(){}
	
	Triangle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	Triangle(double side1, double side2, double side3,  String color){
		super(color);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	Triangle(double side1, double side2, double side3,  String color, boolean filled){
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getArea(){
		double s = getPerimeter();
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side3) / 2;
	}
	public String toString(){
		return "Triangle: side1 = " + this.side1 + ", side2 = " + this.side2 + ", side3= " + this.side3;
	}
	
}