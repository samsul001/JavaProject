//Interface is exactly same as Class (blueprint of class)
//Interface contains static and final variable by default 
//Interface contains only abstract methods and methods are public by default
//Interface methods cannot be static and final, because interface contains only abstract methods.
// static and final methods cannot be abstract.
//Interface cannot have Constructors, because interfaces are not able to instanciate

//abstract methods:- A method only have definition but not implementation
//Interface can not be instantiated , following are the example
// interface testObj = new interface(); //not valid
// interface testObj = new class(); //valid
//Multiple inheritance can be achieved using Interface, 
// class C can implement interface A and Interface B
//"Implements" keyword is used to implement Interface to class, here abstract methods from interface will be implemented
// to sub class. 
//"extends" keyword is used to inherit interface to interface, because methods from one interface can not be implemented
// to another interface
// because interface only contains abstract method, "extends" keyword will be used to inherit a interface to interface
//If one interface is inherited to another interface, class will be required to implement the abstract methods from
// both Super and child interfaces
package interfacepckg;

interface testInt {
	int a = 10;
	int b = 20;
	void m1();
}

public class interface1 implements testInt{


	public static void main(String[] args) {
		//testInt testObj = new testInt() //Not Valid, interface can not instantiate
		testInt testObj = new interface1();
		testObj.m1();
		
		interface1 obj = new interface1();
		obj.m1();
		
	}
	
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
	}

}
