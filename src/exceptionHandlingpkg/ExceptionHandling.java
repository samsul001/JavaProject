package exceptionHandlingpkg;
//Exception:- Exception is an abnormal event which terminates the program unexpectedly, rest of the code will not execute.
//Exception Handling:- Exception handling is a process of handling exception which suppose to terminate program unexpectedly
//2 types of Exceptions:-
//1.Checked Exception, 2.Un-checked Exception
//Checked Exception:- Checked Exception which are identified by Java Compiler
// Example for Checked Exception :- IOException, FileNotFoundException, SQLException etc.,
//Un-checked Exception:- Un checked Exception which are not identified by Java Compiler
// Example for Unchecked Exception:- Arithmetic Exception, NullPointerexception, NumberFormatException, ArrayIndexOutofBoundException etc.,
//try block - specify the statement which causes exception
//catch block - Handles the exception if any, always used for print a message from exception
//finally block - some code(not mandatory), it will have recovery code
// Use of finally block -> let me say Database connection example
// If we want to connect a db through java program , we will establish the connection to db. When will program establish connect ? If db is
// available, then will establish the connection or else it throws exception. In try block, we will put the connection details
// If connection is there , no issue. But if connection is  not there / suppose db is not available, then it throw an execption.
// before handling the exception, catch block just will print the exception type, it wont handle anything, in the finally block, some other
// db connection will be specified ,  that is the recovery step, If one db connection is failed to connect, use some other db connection

//Unchecked exception
//Three scenarios is in try, catch and finally blocks working process
//1. Exception occurs, catch block handles, finally block also execute
//2. Exception occurs, catch block does not handle, finally block execute
//3. Exception not occurs, catch block will ignore, finally block execute

//Checked Exception:-
// 1. Catch block always wont handle exception
// 2. throws keyword only used for checked exception. 
//     throws keyword applied in method level where as try catch block applied in statement level


public class ExceptionHandling {

	public static void main(String[] args) {
		//System.out.println("Started");
		//Thread.sleep(4000); //Checked Exception - Interrupted Exception 
		//System.out.println("Stopped");
		
		//int i=10;
		//System.out.println(i/0); //Unchecked exception - Arithmetic Exception
		//m1();
		//m2();
		//m3();
		m4();

	}
	
	static void m1() { //Arithmetic Exception
		System.out.println("Program Started");
		int a = 10;		
		try {
			System.out.println(a/0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("program ended");
	}
	
	@SuppressWarnings("null")
	static void m2() { //Null pointer exception
		System.out.println("Program started");
		String str = null;
		try {
		System.out.println(str.length());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program ended");
		
	}
	
	static void m3() { //Number Format Exception
		System.out.println("Program started");
		String str1 = "cgfeee";
		
		try {
			int a = Integer.parseInt(str1);
			System.out.println(a);
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program ended");
	}
	
	static void m4() {
		System.out.println("Program started");		
		int arr[] = {1,2,3,4,5,6};
		
		try {
		System.out.println(arr[10]);
		}
		catch(Exception e) {
			e.printStackTrace(); 
		}
		System.out.println("Program ended");
	}

}
