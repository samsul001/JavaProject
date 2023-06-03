package AccessModifiers;

public class class2 {

	public static void main(String[] args) {
		//default
		//trying to access class B from class1, class B's variable and method is defined as default access modifier
		// class B's methods and variables from class1 can be accessible to class2, As they are all within same package
		B obj = new B(); 
		obj.c = 1;
		obj.d = 5;
		obj.m2();
		
		//Private
		//trying to access class A from class1, class A's variable and method are defined as private, so they will not be accessible
		/*
		A obj1 = new A(); //Not accessible outside the class file
		obj1.
		 */
		
		//Protected
		C obj1 = new C();
		obj1.e=14;
		obj1.f=5;
		obj1.m3();
		
		//public
		D obj2 = new D();
		obj2.g=12;
		obj2.h=10;
		obj2.m4();

	}

}
