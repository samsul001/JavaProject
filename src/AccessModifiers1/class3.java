package AccessModifiers1;
import AccessModifiers.*;
public class class3 extends class1 {

	public static void main(String[] args) {
		//A obj = new A(); <- Private, not accessible outside the class
		//B obj =new B(); <- default <- not accesible outside the package
		class3 obj = new class3(); // <- protected <- not accessible outside the package but can access through inheritance
		obj.c=34;
		obj.d=5;
		obj.m2();
		
		obj.g=12;
		obj.h=6;
		obj.m4();

	}

}
