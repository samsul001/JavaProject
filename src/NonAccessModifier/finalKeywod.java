package NonAccessModifier;
//The "final" keyword can be defined in Variable, Method and Class
// If final is defined in variable, value of variable can not be changed(Remains constant)
// If final is defined in method, the method can not be overridden
// If final is defined in class, the class can not be extended(means no child class can acquire properties of final Parent class)
// Final keyword is generally used for limiting access of variable/method/classes by other devs
public class finalKeywod {


	public static void main(String[] args) {
		/*
		Test obj = new Test();
		//obj.a=20; //Final field Test.a can not be assigned
		//obj.b=20; // it will work
		obj.m1();
		
		Test1 obj1 = new Test1();
		obj1.a=10;
		obj1.b=12;
		obj1.m1();
		*/

	}

}

// final keyword with variable an method
/*
class Test {
	final int a=10;
	int b;
	final void m1() {
		//a=10; // Value of final variable can not be changed
		b=15;
		System.out.println(a+b);
	}
}

class Test0 extends Test {
	void m1() { //Final method can not be overridden
		
	}
} 
*/


//final keyword with class
/*
final class Test1 {
	int a;
	int b;
	final void m1() {
		System.out.println(a+b);
	}
}

class Test2 extends Test1 { //Final class can not be extended
	
}
*/
