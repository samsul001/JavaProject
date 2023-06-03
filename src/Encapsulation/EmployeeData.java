package Encapsulation;
//Encapsulation in java is a mechanism of wrapping the data(Private variables) and code acting on the data(methods)
// together as a single unit.

//In Encapsulation, variables are hidden from other classes and can be accessed only through getters and setters 
// methods of their current class. So this is also known as Data hiding.

//How to implement Encapsulation:-
//1. Create private data(Private variables): so that these variables can not be accessed directly from outside classes
//2. Create getter and setter methods: so that these values can be accessed and updated(Optional)

public class EmployeeData {

	private String empName;
	private int ssn;
	private int empID;
	
	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		String name = emp.empName = "Samsul";
		int ssnNo = emp.ssn = 14011;
		int empIDNo = emp.empID = 250;
		
		System.out.println("Emp Name: "+name+" , "+"SSN NO: "+ssnNo+" , "+"employee ID: "+empIDNo);

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

}
