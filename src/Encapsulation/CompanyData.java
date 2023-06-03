package Encapsulation;

public class CompanyData extends EmployeeData{
	
	public static void main(String[] args) {
		CompanyData obj = new CompanyData();
		
		obj.setSsn(1234);
		obj.setEmpID(2011);
		obj.setEmpName("Pavan");
		
		int eID =obj.getEmpID();
		String eName = obj.getEmpName();
		int eSSN =obj.getSsn();
		
		System.out.println(eID+" , "+eName+" , "+eSSN);
	}

}
