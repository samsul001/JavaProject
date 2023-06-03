package inheritancepkg;

public class MethodOverriding {

	//Method Overriding - Redefine the same method from Parent class into Child class (At least we need 2 classes(1 Parent+i child))
	// Method Overloading requires "no inheritance" whereas Method Overriding requires "inheritance"
	// In Method Overloading, definition should not be same whereas Definition should be same for Overriding but body can be changed 
	// Say for example, RBI set a min rate of interest which will be varying across all other banks like SBI, ICICI, AXIS


	public static void main(String[] args) {

		SBI obj1 = new SBI();
		System.out.println(obj1.getrateofInterest());

		ICICI obj2 = new ICICI();
		System.out.println(obj2.getrateofInterest());

		AXIS obj3 = new AXIS();
		System.out.println(obj3.getrateofInterest());

	}

}
class Bank {
	int getrateofInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getrateofInterest() {
		return 15;
	}
}

class ICICI extends Bank {
	int getrateofInterest() {
		return 10;
	}
}

class AXIS extends Bank {
	int getrateofInterest() {
		return 12;
	}
}
