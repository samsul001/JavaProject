package JdkJreJvmMainMethod;

public class General {
	
	//JDK, JRE, JVM and public static void main
	
	//JDK- Java Development Kit which also internally contains JRE and JVM. It used for developing java application/software
	
	//JRE- Java Runtime Environment - Sometimes we dont need to install full JDK, just JRE enough. Because JRE
	// mainly used for running/installing a java application/software. By using JRE , we cannot develop a java 
	// application but can run a java application. JRE should be installed to run/install a Java application. 
	// JRE provides JVM internally
	
	//JVM- Java Virtual Machine, it is a main engine responsible for executing java programs. 
	// it is compiling java programs internally.
	
	//public static void main(String[] args) - When we want to execute a java program, Java looking for public sta...main() method
	// JVM is actually looking for public static... main(), because JVM is responsible for executing java programs. JVM requires this
	// particular method, beacuse whenever the JVM implemented by some developers , they have designed internal code such a way that 
	// public stati ... main() should be present, Exactly same syntax of main method is required to execute program
	// public static void main(int args) <- JVM will not understand, because int argument is passed instead String[]

	public static void main(String[] args) {
		

	}

}
