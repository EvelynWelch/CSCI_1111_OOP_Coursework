// author: Evie Welch
// date: 18/01/23

 public class Rectangle {
	double height;
	double width;
	
	Rectangle(){
		this.height = 1;
		this.width = 1;
	}
	
	Rectangle(double width, double height){
		this.height = height;
		this.width = width;
	}
	
	public double getArea(){
		return this.width * this.height;
	}
	public double getPerimeter(){
		return (height * 2) + (width * 2);
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println("rectangle1: ");
		System.out.printf("Height: %.0f, Width: %.0f %n", rectangle1.height, rectangle1.width);
		System.out.printf("Area: %.0f %n", rectangle1.getArea());
		System.out.printf("Width: %.0f %n", rectangle1.getPerimeter());
		
		System.out.println("rectangle2: ");
		System.out.printf("Height: %.2f, Width: %.2f %n", rectangle2.height, rectangle2.width);
		System.out.printf("Area: %.2f %n", rectangle2.getArea());
		System.out.printf("Width: %.2f %n", rectangle2.getPerimeter());
	}
}