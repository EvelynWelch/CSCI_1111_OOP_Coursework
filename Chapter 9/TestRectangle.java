// author: Evie Welch
// date: 18/01/23

class TestRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println("rectangle1: ");
		System.out.printf("Height: %.0f, Width: %.0f %n", rectangle1.height, rectangle1.width);
		System.out.printf("Area: %.0f %n", rectangle1.getArea());
		System.out.printf("Width: %.0f %n", rectangle1.getPerimeter());
		System.out.println("");
		System.out.println("rectangle2: ");
		System.out.printf("Height: %.2f, Width: %.2f %n", rectangle2.height, rectangle2.width);
		System.out.printf("Area: %.2f %n", rectangle2.getArea());
		System.out.printf("Width: %.2f %n", rectangle2.getPerimeter());
	}
}