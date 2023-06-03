package inheritancepkg;

public class Test1 {
	//Inheritance - It means acquiring all the methods, variables and  properties of a parent class to child class
	// Child class acquiring the properties of Parent class and child class also having its own property
	//"extends" keyword is used for inheritance concept
	// Java supports Single inheritance, Multi level inheritance, Hierarchical inheritance
	// Java doesn't support Multiple Inheritance, Hybrid Inheritance
	// types of inheritance:- 
	// 1. Single Inheritance, 2. Multi level inheritance, 3. Multiple Inheritance(X), 4. Hierarchical Inheritance,
	// 5. Hybrid Inheritance(X)


	public static void main(String[] args) {
		/*The following code is when we dont inherit classes
		A.a=10;
		A.b=20;
		A.display();

		B obj1 = new B();
		obj1.x=10;
		obj1.y=5;
		obj1.show();

		C obj2 = new C();
		obj2.m=41;
		obj2.n=19;
		obj2.sub(); */

		/* Single inheritance
		B obj = new B();
		obj.a = 10;
		obj.b = 20;
		obj.x = 30;
		obj.y = 2;

		obj.display();
		obj.show(); */

		/* Multi level inheritance
		C obj = new C();
		obj.a = 5;
		obj.b = 10;
		obj.x = 20;
		obj.y = 10;
		obj.m = 2;
		obj.n = 10;
		obj.display();
		obj.show();
		obj.sub();
		 */

		/* Hierarchical inheritance, here child classes B and D inheriting one Parent class A
		D obj = new D();
		obj.a=10;
		obj.b=10;
		obj.d=5;
		obj.e=5;
		obj.display();
		obj.div();

		B obj1 = new B();
		obj1.a=20;
		obj1.b=20;
		obj1.x=2;
		obj1.y=10;
		obj1.display();
		obj1.show();
		 */

	}

}

class A {
	int a;
	int b;

	public void display() {
		System.out.println(a+b);
	}
}

class B extends A {
	int x;
	int y;

	public void show() {
		System.out.println(x*y);
	}
}

//Class C and D acquiring properties of same parent class A, it is called as Hierarchical Inheritance,
// here class C and D doesn't relate each other but they inheriting same parent class A

class C extends A {
	int m;
	int n;

	public void sub() {
		System.out.println(m-n);
	}
}

class D extends A {
	int d;
	int e;

	public void div() {
		System.out.println(d/e);
	}

//Hybrid Inheritance is combination of Hierarchical and Multiple inheritance
//So it is not supported in Java using class

}
