package javaprogrammingtopics;

public class ArraysInJava {

	public static void main(String[] args) {
		//Arrays1();
		//ArraysWithForLoop();
		//ArraysWithForEach();
		//Arrayslength();
		//StoreValuesWithoutLimit();
		//SumOfIntEleInArray();
		ArraysWithObjectDataType();
	}
	
	public static void Arrays1() {
		int a[] = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[3]);
		System.out.println(a[0]);
	}
	
	public static void ArraysWithForLoop() {
		int b[] = new int[10];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
	}
	
	public static void ArraysWithForEach() {
		int b[] = new int[10];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		for(int i:b) {
			System.out.println(i);
	}
	}
	
	public static void Arrayslength() {
		String str[]=new String[3];
		str[0]="My love";
		str[1]="is";
		str[2]="Falee Baby";
		
		int len = str.length;
		System.out.println(len);
		
		for(String i:str) {
			System.out.println(i);
		}
	}
	
	public static void StoreValuesWithoutLimit() {
		int a[] = {10,20,25,35,42,54};
		int b = a.length;
		System.out.println(b);
		for(int i:a) {
			System.out.println(i);
		}
		
	}
	
	public static void SumOfIntEleInArray() {
		int a[] = {10,20,30,40,50,60};
		int sum = 0;
		
		for(int i:a) {
			//System.out.println(i);
			sum = sum+i;
		}
		System.out.println(sum);
	}
	
	public static void ArraysWithObjectDataType() {
		Object arr[] = {10,20,'c',"Welcome",true};
		//System.out.println(arr.length);
		for(Object i:arr) {
			System.out.println(i);
		}
	}

}
