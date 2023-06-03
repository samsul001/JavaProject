package oopsConcepts;




public class MethodOverLoading {

	//1. Method Overloading:- A class contains more than one method with same name is called method overloading
	//2. Constructor Overloading:- A class contains more than one constructor is called constructor overloading
	//Whenever we follow method/constructor overloading, We follow some rules
	//rule 1. Number of Parameters
	//rule 2. Order of Parameters
	//rule 3. type of Parameters
	
	// This keyword is used to define same variable in constructor/method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mo=new MethodOverLoading();
		//mo.sum();
		mo.sum(10, 5);
		//mo.sum(10, 5.25);
		//mo.sum(10, 10, 10);
		//mo.sum(10, 2, 21, 8);
		

	}
	int a;
	int b;
	void sum() {
		a = 10;
		b = 20;
		System.out.println(a+b);
	}
	//2. same method name but differ in number of parameters
	void sum(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}
	//differ in number of parameters
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	//differ in number of parameters
	void sum(int a, int z, int y, int c) {
		System.out.println(a+y+z-c);
	}
	
	//differ in type of parameters
	void sum(int x, double y) {
		System.out.println(x*y);
	}
	

}
