// Author: Evie Welch
// date: 25/01/23
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter side2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter side3: ");
		double side3 = input.nextDouble();
		System.out.print("Enter a color: ");
		String color = input.next();
		System.out.print("Filled: ");
		boolean filled = input.nextBoolean();
		System.out.println("");
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		System.out.println(triangle.toString());
		System.out.println("area: " + triangle.getArea());
		System.out.println("perimeter: " + triangle.getPerimeter());
	}

}
