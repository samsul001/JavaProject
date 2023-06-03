package exceptionHandlingpkg;

public class checkedException {

	public static void main(String[] args)  {
		//m1();
		m2();

	}
	
	static void m1() throws InterruptedException{
		System.out.println("Program started");
		
		Thread.sleep(4000);
		
		System.out.println("Program Ended");
	}
	
	static void m2() {
		System.out.println("Program started");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Program Ended");
	}

}
