package oopsConcepts;

public class Calculation {

	//Four types of methods declarations in Java
	//1. Methods may not take parameters
	//2. Methods may take parameters
	//3. Methods return some datatype
	//4. methods may not return some datatype
	
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		/*cal.a = 100;
		cal.b = 200;
		cal.sum();*/
		//cal.mul(10, 4);
		cal.a = 10;
		cal.b = 5;
		int res = cal.sub();
		System.out.println(res);

	}
	
	int a;
	int b;
	
	//1. Methods may not takes parameters
	void sum() {
		System.out.println(a+b);
	}
	
	//2. Methods takes parameters
	void mul(int x, int y) {
		a=x;
		b=y;
		System.out.println(a*b);
	}
	
	//3. Methods may return some datatype
	
	int sub() {
		return(a-b);	
	}

}
