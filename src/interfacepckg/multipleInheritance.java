package interfacepckg;

interface A {
	int a = 10;
	int b = 20;
	void sum();
}

interface B extends A{
	int c = 2;
	int d = 5;
	void multi();
}

interface C {
	int e = 50;
	int f = 15;
	void subtraction();
}

public class multipleInheritance implements B,C {

	public static void main(String[] args) {
		multipleInheritance mi = new multipleInheritance();
		mi.sum();
		mi.subtraction();
		mi.multi();
	}

	
	public void sum() {
		System.out.println(a+b);
		
	}

	
	public void subtraction() {
		System.out.println(e-f);
		
	}

	
	public void multi() {
		System.out.println(c*d);
		
	}

}
