// Author: Evie Welch
// date: 25/01/23

public class ImplementationTest {

	public static void main(String[] args) {
		GeometricObject[] geoObjs = new GeometricObject[5];
		for(int i = 0; i < geoObjs.length; i++) {
			geoObjs[i] = new Triangle(i+1, i+1, i+1, "blue", false);
			System.out.printf("Traingle %d: %n", i+1);
			System.out.printf("area: %f %n", geoObjs[i].getArea());
			if(geoObjs[i] instanceof Colorable) {
				((Colorable)geoObjs[i]).howToColor();
			}	
			System.out.println("");
		}
	
	}

}
