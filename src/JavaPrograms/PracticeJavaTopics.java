package JavaPrograms;

public class PracticeJavaTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//twoDiaArrForLoop();
		twoDiamArrayWithForEach();
		//twoDiamObjectArrayFor();

	}

	public static void twoDiaArrForLoop() {
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

		for(int i=0;i<=4;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void twoDiamArrayWithForEach() {
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
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void twoDiamObjectArrayFor() {
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
		 * for(Object[] i:arr) { for(Object j:i) { System.out.print(j + " "); }
		 * System.out.println(); }
		 */
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=1;j++) {				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
