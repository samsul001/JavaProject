package NonAccessModifier;

public class StaticKeyword {

	//Static variables/methods are commonly shared across all the objects
	//Static variables/methods are stored in different memory location then non-static stuffs.
	//Static variable/methods can be accessed directly through class name instead of accessing through object
	//Non static variable/method can be accessed through object only, can't directly access through class name
	//A variable/method will remain non-static until they were defined as static
	//non-static method can access static/non-static without object
	StaticKeyword() {
		
	}
	
	StaticKeyword(int x, int y) {
		b=x;
		c=y;
	}
	
	int a=4;
	static int b=10;
	static int c=20;
	
	static void m1() {
		System.out.println("This is static method");
	}
	
	void m2() {
		System.out.println("This is non-static method");
	}
	
	void m3() {
		//non-static method can access static/non-static without object
		a=100;
		b=500;
		m2();
		m1();
	}
	
	static void m4() {
		System.out.println(b+c);
	}
	static { //Even though static block is not part of main method, it will be initialized first before any non-static methods
		System.out.println("This satatic block will execute first");
	}
	
	public static void main(String[] args) {
		//the following static stuffs are accessed directly without invoking an object
		//following example, static stuffs are access without mentioning class name as this main method is declared inside the same class file
		//b=150;
		//System.out.println(b);
		
		
		StaticKeyword se = new StaticKeyword();
		StaticKeyword se1 = new StaticKeyword();
		StaticKeyword se2 = new StaticKeyword();

		se.a=5;
		se1.a=6;
		se2.a=7;
		System.out.println(se.a);
		System.out.println(se1.a);		
		System.out.println(se2.a);
		
		se.b=5;
		se1.b=6;
		se2.b=24;
		System.out.println(se.b);
		System.out.println(se1.b);		
		System.out.println(se2.b);
		
		StaticKeyword se3 = new StaticKeyword(15, 25);
		StaticKeyword se4 = new StaticKeyword(25, 25);
		se3.m4();
		se4.m4();
				
		
	}

}
