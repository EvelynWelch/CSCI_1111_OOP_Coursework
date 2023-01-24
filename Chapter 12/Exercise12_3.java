// author: Evie Welch
// date: 24/01/23
import java.util.*;

class Exercise12_3 {
	public static Integer[] createArray(){
		Integer[] array = new Integer[100];
		Random rd = new Random();
		for(int i = 0; i < array.length; i++){
			Integer r = rd.nextInt();
			array[i] = r;
		}
		return array;
	}
	public static Integer getInt(Integer[] array, int index) throws IndexOutOfBoundsException{
		return array[index];
	}
	public static void promptUser(){
		Scanner input = new Scanner(System.in);
		Integer[] array = createArray();
		System.out.printf("Enter a number between 1 and %d: ", array.length);
		int index = input.nextInt() -1;
		try {
			int r = getInt(array, index);
			System.out.printf("The number at index %d is: %d", index +1, r);
		} catch (Exception e) {
			System.out.println("Out of Bounds");
			promptUser();
		} 
	}
	public static void main(String[] args) {
		promptUser();
	}
}