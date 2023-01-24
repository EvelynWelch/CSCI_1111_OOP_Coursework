// author: Evie Welch
// date: 23/01/23

class TestTriangle {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(2.0, 2.0, 2.0, "blue", false);
		System.out.println(triangle1.toString());
		System.out.println("dateCreated: " + triangle1.getDateCreated());
		System.out.println("color: " + triangle1.getColor());
		System.out.println("filled: " + triangle1.getFilled());
		System.out.println("area: " + triangle1.getArea());
		System.out.println("perimeter: " + triangle1.getPerimeter());
	}
}