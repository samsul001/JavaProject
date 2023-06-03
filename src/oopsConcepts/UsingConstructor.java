package oopsConcepts;

public class UsingConstructor {
	
	//1. Constructor name should be same as Class name
	//2. Constructor wont return any value, It used to initialise values
	//3. Constructors will be called default at the moment when an instance of a class is created

	public static void main(String[] args) {

		UsingConstructor emp1 = new UsingConstructor(1001, "samsul", 1200, 10);
		emp1.display();

		UsingConstructor emp2 = new UsingConstructor(1002, "RAJ", 2500, 12);
		emp2.display();

	}
	int empid;
	String empname;
	int Salary;
	int deptno;

	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(Salary);
		System.out.println(deptno);
	}

	public UsingConstructor(int id, String name, int sal, int dno) {
		empid = id;
		empname = name;
		Salary = sal;
		deptno = dno;

	}

}
