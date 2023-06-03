package exceptionHandlingpkg;
//Three scenarios is in try, catch and finally blocks working process
//1. Exception occurs, catch block handles, finally block also execute
//2. Exception occurs, catch block does not handle, finally block execute
//3. Exception not occurs, catch block will ignore, finally block execute
public class TryCatchFinally {

	public static void main(String[] args) {
		m1();
		//m2();
		m3(); 

	}
	
	static void m1() { //1. Exception occurs, catch block handles, finally block also execute
		int a[] = {1,2,3,4};
		
		try {
			a[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
	}
	
	static void m2() { //2. Exception occurs, catch block does not handle, finally block execute
		String str = null;
		
		try {
			@SuppressWarnings("null")
			int len = str.length();
			System.out.println(len);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This finally block");
		}
	}
	
	static void m3() { //3. Exception not occurs, catch block will ignore, finally block execute
		String arr[] = {"abcd","efgh","ijkl"};
		
		try {
			arr[2] = "welcome";
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
