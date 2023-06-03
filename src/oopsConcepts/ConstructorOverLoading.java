package oopsConcepts;

public class ConstructorOverLoading {

	//1. Constructor is special kind of method
	//2. Constructor name should be same as class name
	//3. Constructor will not return any value
	//4. Constructor will be invoked at the time of object creation, We dont need to call the constructor explicitly 
	//5. Constructor will take parameters (Just like methods)
	//6. Constructor is used for initialise values at the runtime/the time of object creation.
	
	//two types of Constructor
	//1. Default Constructor:- Constructor without having any parameter
	//2. Parameterised Constructor:- Constructor with having parameter
	
	//This keyword
	//1. This keyword is used to specify same variable inside a constructor/Method
	
	public static void main(String[] args) {
		//ConstructorOverLoading co = new ConstructorOverLoading(); //First 
		//ConstructorOverLoading co = new ConstructorOverLoading(5, 1.2); //Third
		ConstructorOverLoading co = new ConstructorOverLoading(10, 12); //Second
		//ConstructorOverLoading co = new ConstructorOverLoading(1, 1, 1.2); //Fourth
		//ConstructorOverLoading co = new ConstructorOverLoading(1, 2.25, 25); //Fifth
		co.display();

	}
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverLoading() { //First
		a=10;
		b=5;
		c=10.5;
	}
	
	ConstructorOverLoading(int a, int b){ //Second
		this.a=a;
		this.b=b;
	}
	
	ConstructorOverLoading(int x, double y){ //Third
		a=x;
		c=y;
	}
	
	ConstructorOverLoading(int x, int y, double z){ //Fourth
		a=x;
		b=y;
		c=z;
	}
	
	ConstructorOverLoading(int x, double y, int z){ //Fifth
		a=x;
		b=z;
		c=y;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+b+c);
	}

}
