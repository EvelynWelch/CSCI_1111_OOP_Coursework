// author: Evie Welch
// date: 18/01/23

class MyInteger {
	int value;
	MyInteger(int value){
		this.value = value;
	}
	public int getValue(){
		return this.value;
	}
	public boolean isEven(){
		return (this.value % 2 == 0) ? true : false;
	}
	public boolean isOdd(){
		return (this.value % 2 != 0) ? true : false;
	}
	public boolean isPrime(){
		boolean prime = true;
		double sqrtN = Math.sqrt(this.getValue());
		for(int i = 2; i <= sqrtN; i++){
			if((this.getValue() % i) == 0){
				prime = false;
			}
		}
		return prime;
	}
	public boolean isEqual(int n){
		return n == this.getValue();
	}
	public boolean isEqual(MyInteger n){
		return n.getValue() == this.getValue();
	}
	// static methods
	static public boolean isEven(int n){
		return (n % 2 == 0) ? true : false;
	}
	static public boolean isOdd(int n){
		return (n % 2 != 0) ? true : false;
	}
	static public boolean isPrime(int n){
		boolean prime = true;
		double sqrtN = Math.sqrt(n);
		for(int i = 2; i <= sqrtN; i++){
			if((n % i) == 0){
				prime = false;
			}
		}
		return prime;
	}
	static public boolean isEven(MyInteger n){
		return (n.getValue() % 2 == 0) ? true : false;
	}
	static public boolean isOdd(MyInteger n){
		return (n.getValue() % 2 != 0) ? true : false;
	}
	static public boolean isPrime(MyInteger n){
		// TODO: figure this out.
		boolean prime = true;
		double sqrtN = Math.sqrt(n.getValue());
		for(int i = 2; i <= sqrtN; i++){
			if((n.getValue() % i) == 0){
				prime = false;
			}
		}
		return prime;
	}
	static int parseInt(char[] c){
		String s = new String(c);
		return Integer.parseInt(s);
	}
	static int parseInt(String s){
		return Integer.parseInt(s);
	}
}