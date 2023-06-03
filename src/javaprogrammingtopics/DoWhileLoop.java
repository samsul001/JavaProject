package javaprogrammingtopics;

public class DoWhileLoop {

	public static void main(String[] args) {
		//printUsingDoWhile();
		//printFirstLoopData();
		//printOddNumber();
		//---------------------------------------------------------
		//incrementDoWhile();
		//decrementDoWhile();
		//evenOddNumDoWhile();
		arrayWithDoWhile();
	}
	
	public static void printUsingDoWhile() {
		
		int i = 10;
		
		do {
			System.out.println(i);
			i+=5;
		}while(i<=100);
		
	}
	
	public static void printEvenUsingDoWhile() {
		
		int i = 2;
		do {
			System.out.println(i);
			i += 2;
		}while(i<=22);
		
	}
	
	public static void printFirstLoopData() {
		int j = 10;
		do {
			System.out.println(j);
			j++;
		}while(j<=9);
	}
	
	public static void printOddNumber() {
		int k = 1;
		do {
			System.out.println(k);
			k += 2;
		}while(k<=12);
	}
	
	//-----------------------------------------------------------------------------------------------
	
	public static void incrementDoWhile() {
		int num =1;
		do {
			System.out.println(num);
			num++;
		}while(num<=10);
	}
	
	public static void decrementDoWhile() {
		int num =10;
		do {
			System.out.println(num);
			num--;
		}while(num>10);
	}
	
	public static void evenOddNumDoWhile() {
		int num = 15;
		do {
			if(num%2 ==0) {
				System.out.println(num+" is even number");
			}
			else {
				System.out.println(num+" is odd number");
			}
			num--;
		}while(num>=0 && num != 15);
	}
	
	public static void arrayWithDoWhile() {
		int a[] = {1,2,4,6,44};
		int len = a.length;
		int i=0;
		do {
			System.out.print(a[i]+" ");
			i++;
			
		}while(i<len && i != 1);
	}

}
