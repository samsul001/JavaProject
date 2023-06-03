package oopsConcepts;

public class UsingMethod {

	public static void main(String[] args) {
	UsingMethod emp1 = new UsingMethod();
	emp1.setData(1001, "samsul", 1200, 10);
	emp1.display();
	
	emp1.setData(1002, "Raj", 2500, 21);
	emp1.display();

	}
	
	int empid;
	String empname;
	int Salary;
	int deptno;
	
	void setData(int id, String name, int sal, int dno) {
		empid = id;
		empname = name;
		Salary = sal;
		deptno = dno;
	}
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(Salary);
		System.out.println(deptno);
	}

}
