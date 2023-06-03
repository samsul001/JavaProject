
public class SecondJavaProgram extends FirstJavaProgram {

	public static void main(String[] args) {
		/*
		 * System.out.println("Second Program");
		 * 
		 * int a = 10; int b = 5;
		 * 
		 * //Arithmetic operator System.out.println(a/b); System.out.println(a%b);
		 * System.out.println(a&b);
		 * 
		 * //Relational Operator System.out.println(a<b); System.out.println(a>=b);
		 * System.out.println(a<=b);
		 */
		
		int a = 10; 
		int b = 5;

		//logical Operator
		boolean c = true;
		boolean d = false;
		boolean e = true;
		boolean f = false;

		System.out.println(c&&d); System.out.println(c&&e); System.out.println(d&&e);
		System.out.println(d&&f);

		System.out.println(c||d);
		System.out.println(c||e);
		System.out.println(d||e);
		System.out.println(d||f);
		
		System.out.println(!c);
		System.out.println(!d);
		
		//Assignment operator
		int g=a;
		int h=b;
		
		System.out.println(g);
		System.out.println(h);
		
		h++;
		h += 5;
		a -= 3;
		
		System.out.println(a);
		System.out.println(h);
		
	}

}
