package NonAccessModifier;
//Abstract modifier is used to define methods that will be implemented in sub class later on
//Its generally used to implemet in sub class and for some reasons , it cant be implemented in super class
//If class contains an abstract methods, it must be also declared abstract.
//Object can not be created for abstract class

abstract class AbstractKeyWord {

	int totalHours;
	int hoursPerrate;
	int fixedRate;
	
	abstract int salary(int totalHours, int hoursPerrate);
	
	abstract int salary(int fixedRate);
	

	void complanyDetail() {
		System.out.println("This is a good company");
	}

}


	



