package oopsConcepts;
//Method Overriding:- If parent and child class having methods with same name, the parent class method will be
// overrided by child class.

//Method Overriding requires Methods with Same name, same num of parmeter and same type of parameters.
// Example:- In Interfaces, class implements interface methods by Method overriding concept.

public class MethodOverriding extends MethodOverLoading{
	int num1=10;
	int num2=5;
	void sum() {
		System.out.println("sum method is overrided: "+(num1*num2));
	}
	public static void main(String[] args) {
		MethodOverriding mor = new MethodOverriding();
		mor.sum();

	}
}