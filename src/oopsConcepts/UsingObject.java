package oopsConcepts;

public class UsingObject {

	public static void main(String[] args) {
		UsingObject emp1 = new UsingObject();
		emp1.empid = 100;
		emp1.empname = "Raj";
		emp1.Salary = 250;
		emp1.deptno = 10;
		emp1.display();
		
		UsingObject emp2 = new UsingObject();
		emp2.empid = 101;
		emp2.empname = "Sam";
		emp2.Salary = 350;
		emp2.deptno = 20;
		emp2.display();

	}
	
	int empid;
	String empname;
	int Salary;
	int deptno;
	
	void display(){
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(Salary);
		System.out.println(deptno);
	}

}
