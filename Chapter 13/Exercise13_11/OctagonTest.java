// Author: Evie Welch
// date: 25/01/23

public class OctagonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Octagon oct1 = new Octagon(2,2,2,2,2,2,2,2);
		Octagon oct2 = (Octagon)oct1.clone();
		System.out.println("oct1.compareTo(oct2): " + oct1.compareTo(oct2));
		
	}

}
