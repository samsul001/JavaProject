package javaprogrammingtopics;

public class WhileLoop {

	public static void main(String[] args) {

		//seriesNum_ascending();
		//seriesNum_decending();
		//WhileLoop sam = new WhileLoop();
		//sam.evenNum();
		//OddNum();
		//----------------------------------
		//incrementWhile();
		//decrementWhile();
		//evenOddNumWithWhile();
		evenOddNumBetweenIntervals();

	}

	public static void seriesNum_ascending() {
		int i = 1;
		while(i<12) {
			System.out.println(i);
			i++;
		}
	}

	public static void seriesNum_decending() {
		int j = 100;
		while(j>=10) {
			System.out.println(j);
			j -= 3;
		}
	}

	public void evenNum() {
		int n = 2;
		while(n<=10) {
			System.out.println(n);
			n +=2;
		}
	}

	public static void OddNum() {
		int i = 12;
		while(i>=1) {
			if(i%2==1) {
				System.out.println(i+" is an Odd Number");
			}
			else {
				System.out.println(i + "is an Even Number");
			}
			i--;

		}
	}
	
	public static void newPrgrms() {
		System.out.println("----------------------------------------------------------------------------");
	}
	
	public static void incrementWhile() {
		int n=1;
		while(n<10) {
			System.out.print(n+" ");
			n++;
		}
	}
	
	public static void decrementWhile() {
		int n=10;
		while(n>=5) {
			System.out.print(n+" ");
			n--;
		}
	}
	
	public static void evenOddNumWithWhile() {
		int num =13;
		while(num != 0) {
			if(num%2 ==0) {
				System.out.println(num+" is an even number");
				break;
			}
			else {
				System.out.println(num+" is odd number");
				break;
			}
		}
	}
	
	public static void evenOddNumBetweenIntervals() {
		int num=25;
		while(num>=1) {
			if(num%2 == 0) {
				System.out.println(num+" is even number");
			}
			else {
				//System.out.println(num+" is odd numbers");
			}
			num--;
		}
	}

}
