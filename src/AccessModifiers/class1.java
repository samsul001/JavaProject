package AccessModifiers;

//Access modifiers are used to restrict access levels of methods, variables, constructors, class and fields in Java package
//Four types of access modifiers:

//Public - The access level of a public modifier is everywhere
//Protected - The access level of protected modifier is within the package and 
//  also outside the package through inheritance
//default - The access level of default modifier is only within the package
//Private - The access level of Private modifier is only within the class.

//private -access modifier
class A {
	private int a = 10;
	private int b = 25;
	private void m1() {
		System.out.println(a+b);
	}
}

//defualt - access modifier
class B {
	int c = 10;
	int d = 15;
	void m2() {
		System.out.println(c+d);
	}
}

//protected - access modifier
class C {
	protected int e = 5;
	protected int f = 2;
	void m3() {
		System.out.println(e/f);
	}
}

//public - access modifier
class D {
	public int g = 6;
	public int h = 3;
	public void m4() {
		System.out.println(g*h);
	}
}

public class class1 {
	
	protected int c = 10;
	protected int d = 15;
	protected void m2() {
		System.out.println(c+d);
	}
	
	public int g = 6;
	public int h = 3;
	public void m4() {
		System.out.println(g*h);
	}

	public static void main(String[] args) {
		/*
		A obj = new A(); //private modifier restrict the access of variables and methods within the package
		obj.
		 */	
		//default
		B obj = new B();
		obj.c=5;
		obj.d=25;
		obj.m2();

		//protected
		C obj1 = new C();
		obj1.e=20;
		obj1.f=3;
		obj1.m3();
		
		//public 
		D obj2 = new D();
		obj2.g = 10;
		obj2.h = 3;
		obj2.m4();
		
		

	}

}
