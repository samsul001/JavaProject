package javaprogrammingtopics;

public class TwoDiamensionalArray {

	public static void main(String[] args) {
		//twoDiamArray();
		//twoDiamObjArray();
		//twoDiamArrayForEach();
		//twoDiamArraySingleLineDef();
		//twoDiamObjArraySingleLine();
		//---------------------------------
		//twoDiamArray1();
		//twoDiamArrayForEach1();
		//twoDiaObjArray1();
		twoDiaObjArray1ForEach();
	}

	public static void twoDiamArray() {
		int a[][] = new int[5][2];

		a[0][0] = 10;
		a[0][1] = 20;

		a[1][0] = 30;
		a[1][1] = 40;

		a[2][0] = 50;
		a[2][1] = 60;
		
		a[3][0] = 70;
		a[3][1] = 80;
		
		a[4][0] = 90;
		a[4][1] = 100;

	
		for(int i=0;i<=4;i++) {  //for incrementing rows
			for(int j=0;j<=1;j++) {  //for incrementing columns
				System.out.print(a[i][j]+" ");
			} 
			System.out.println();
		}


	}
	
	public static void twoDiamObjArray() {
		Object arr[][] = new Object[6][2];
		
		arr[0][0] = "Number";
		arr[0][1] = "  Name";
		
		arr[1][0] = 10001;
		arr[1][1] = "  Basith";
		
		arr[2][0] = 10002;
		arr[2][1] = "  Imran";
		
		arr[3][0] = 10003;
		arr[3][1] = "  Shathick";
		
		arr[4][0] = 10004;
		arr[4][1] = "  Alam";
		
		arr[5][0] = 1005;
		arr[5][1] = "   Anas";
		 
		/*
		 * for(int i=1;i<=5;i++) { for(int j=0;j<=1;j++) {
		 * System.out.println(arr[i][j]); } }
		 */
		
		for(Object[] i:arr) {
			for(Object j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
			
	}
	
	public static void twoDiamArrayForEach() {
		int a[][] = new int[5][2];

		a[0][0] = 10;
		a[0][1] = 20;

		a[1][0] = 30;
		a[1][1] = 40;

		a[2][0] = 50;
		a[2][1] = 60;
		
		a[3][0] = 70;
		a[3][1] = 80;
		
		a[4][0] = 90;
		a[4][1] = 100;
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void twoDiamArraySingleLineDef() {
		int a[][] = {{10,20,30},{40,50,60},{70,80,90},{100,110,120},{130,140,150}};
		//System.out.println(a[0][2]);
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void twoDiamObjArraySingleLine() {
		Object b[][] = {{"Number","Name"," FirstLetter"," avg"},
						{1,"     Sams",'S',93.42},
						{2,"     Anas",'A',80.56},
						{3,"     Velu",'V',90.20111}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void newProgrms() {
		System.out.println("---------------------------------------------------------------------------------");
	}

	public static void twoDiamArray1() {
		int arr[][] = new int[4][3];
		arr[0][0]= 10;
		arr[0][1]= 15;
		arr[0][2]= 18;
		
		arr[1][0]= 10;
		arr[1][1]= 11;
		arr[1][2]= 81;
		
		arr[2][0]= 25;
		arr[2][1]= 44;
		arr[2][2]= 13;
		
		arr[3][0]= 50;
		arr[3][1]= 71;
		arr[3][2]= 19;
		
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	public static void twoDiamArrayForEach1() {
		int arr[][] = new int[4][3];
		arr[0][0]= 10;
		arr[0][1]= 15;
		arr[0][2]= 18;
		
		arr[1][0]= 10;
		arr[1][1]= 11;
		arr[1][2]= 81;
		
		arr[2][0]= 25;
		arr[2][1]= 44;
		arr[2][2]= 13;
		
		arr[3][0]= 50;
		arr[3][1]= 71;
		arr[3][2]= 19;
		
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void twoDiaObjArray1() {
		Object arr[][] = new Object[4][3];
		arr[0][0]= 10;
		arr[0][1]= "samsul";
		arr[0][2]= 'A';
		
		arr[1][0]= 11;
		arr[1][1]= "faleela";
		arr[1][2]= 'S';
		
		arr[2][0]= 12;
		arr[2][1]= "anas";
		arr[2][2]= false;
		
		arr[3][0]= 13;
		arr[3][1]= 1.25;
		arr[3][2]= 300000000;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void twoDiaObjArray1ForEach() {
		Object arr[][] = new Object[4][3];
		arr[0][0]= 10;
		arr[0][1]= "samsul";
		arr[0][2]= 'A';
		
		arr[1][0]= 11;
		arr[1][1]= "faleela";
		arr[1][2]= 'S';
		
		arr[2][0]= 12;
		arr[2][1]= "anas";
		arr[2][2]= false;
		
		arr[3][0]= 13;
		arr[3][1]= 1.25;
		arr[3][2]= 300000000;
		
		for(Object[] i:arr) {
			for(Object j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
