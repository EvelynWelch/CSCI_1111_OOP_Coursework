import javax.sound.midi.*;

class TestMyInteger {
	public static void main(String[] args) {
		int testInt1 = 1;
		int testInt10007 = 10007;
		char[] c = {'1', '2', '3'};
		MyInteger myInt1 = new MyInteger(testInt1);
		MyInteger myInt2 = new MyInteger(2);
		System.out.printf("Initialised MyInteger myInt1 with: %d %n", testInt1);
		int getValue = myInt1.getValue();
		System.out.printf("myInt1.getValue(): %b %n", myInt1.getValue());
		System.out.printf("myInt1.isEven(): %b %n", myInt1.isEven());
		System.out.printf("myInt1.isOdd(): %b %n", myInt1.isOdd());
		System.out.printf("myInt1.isPrime(): %b %n", myInt1.isPrime());
		System.out.printf("myInt1.isEqual(1): %b %n", myInt1.isEqual(1));
		System.out.println("Initialised MyInteger myInt2 with: 2");
		System.out.printf("myInt1.isEqual(myInt2): %b %n", myInt1.isEqual(myInt2));
		System.out.println("");
		System.out.println("Testing static methods");
		System.out.printf("MyInteger.isEven(%d): %b %n", testInt10007, MyInteger.isEven(testInt10007));
		System.out.printf("MyInteger.isOdd(%d): %b %n", testInt10007, MyInteger.isOdd(testInt10007));
		System.out.printf("MyInteger.isPrime(%d): %b %n", testInt10007, MyInteger.isPrime(testInt10007));
		System.out.printf("MyInteger.isEven(myInt2): %b %n", MyInteger.isEven(myInt2));
		System.out.printf("MyInteger.isOdd(myInt2): %b %n", MyInteger.isOdd(myInt2));
		System.out.printf("MyInteger.isPrime(myInt2): %b %n", MyInteger.isPrime(myInt2));
		System.out.printf("MyInteger.parseInt({'1', '2', '3'}): %d %n", MyInteger.parseInt(c));
		System.out.printf("MyInteger.parseInt(\"456\"): %d %n", MyInteger.parseInt("456"));
	}
}