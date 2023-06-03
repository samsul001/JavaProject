package javaprogrammingtopics;

public class OopsConcepts {

	//1. Class is a logical entity whereas Object is a physical entity
	//2. Object is an instance of class
	//3. So when we say an object name, then class will be known of that
	//4. Without classes, we can not create objects
	//5. Class is a collection of Variable and Methods
	//6. Method is piece of code which will perform certain task; methods should be part of the class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OopsConcepts emp1 = new OopsConcepts();
		OopsConcepts emp2 = new OopsConcepts();
		OopsConcepts emp3 = new OopsConcepts();
		
		emp1.empid = 1001;
		emp1.empname = "Raj";
		emp1.Salary = 10000;
		emp1.deptno = 1;
		emp1.display();
		
		emp2.empid = 1002;
		emp2.empname = "Sam";
		emp2.Salary = 5000;
		emp2.deptno = 2;
		emp2.display();
		
		emp3.empid = 1003;
		emp3.empname = "Ram";
		emp3.Salary = 7500;
		emp3.deptno = 3;
		emp3.display();
		
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



}
