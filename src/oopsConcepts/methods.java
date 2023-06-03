package oopsConcepts;

public class methods {

	public static void main(String[] args) {
		methods cal = new methods();
				
		cal.a = 10;
		cal.b = 20;
		cal.sum();
		cal.sub(10, 5);
		int res = cal.mul();
		System.out.println(res);

	}
	
	int a;
	int b;
	
	//1. Methods may not take parameters	
	void sum() {
		System.out.println(a+b);
	}
	
	//2. Methods may take parameters
	void sub(int x, int y) {
		a = x;
		b = y;
		System.out.println(a-b);
	}
	
	//3. Methods return some datatypes
	int mul() {
		return(a*b);
	}

}
