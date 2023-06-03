package JavaPrograms;

public class Sample_JavaPrograms {

	public static void main(String[] args) {
		//EvenOrOdd();
		LargestOfThreeNum();
	}

	public static void swapping() {
		int a = 10;
		int b = 20;

		System.out.println("value of 'a' before swapping is " + a);
		System.out.println("value of 'b' before swapping is " + b);

		int c;

		c=a;
		a=b;
		b=c;

		System.out.println("value of 'a' after swapping is " + a);
		System.out.println("value of 'b' after swapping is " + b);
	}

	public static void EvenOrOdd() {
		int i = 258;

		if(i%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
	}
	
	public static void LargestOfThreeNum() {
		int a = 100;
		int b = 900;
		int c = 201;
		
		if((a>b)&&(a>c)) {
			System.out.println("a is largest number");
		}
		else if((b>a)&(b>c)) {
			System.out.println("b is Largest Number");
		}
		else {
			System.out.println("c is largest Number");
		}
	}

}
