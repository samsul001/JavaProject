package NonAccessModifier;

public class abstractMethodsImplemented extends AbstractKeyWord {
	

	public static void main(String[] args) {
		abstractMethodsImplemented obj = new abstractMethodsImplemented();
		
		int sal=obj.salary(108, 45);
		System.out.println(sal);
		
		int sal1 = obj.salary(5000);
		System.out.println(sal1);
		
		obj.complanyDetail();
	}

	@Override
	int salary(int totalHours, int hoursPerrate) {
		
		return totalHours*hoursPerrate;
	}

	@Override
	int salary(int fixedRate) {
		// TODO Auto-generated method stub
		return fixedRate;
	}
	
	void complanyDetail(){
		System.out.println("method is overriden");
	}
}
