package javaprogrammingtopics;

public class ForLoop {

	public static void main(String[] args) {
		//ForLoopIncrement();
		//ForLoopWithBreak();
		//ForLoopWithCont();
		incrementFor();
		decrementFor();
		//forLoopWIthBreak();
		//forLoopWIthContinue();
	}
	
	public static void ForLoopIncrement() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void ForLoopDecrement() {
		for(int i=10;i>=1;i--) {
			System.out.println(i);
			i--;
		}
	}
	//usage of break
	public static void ForLoopWithBreak() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	//usage of continue
	public static void ForLoopWithCont() {
		for(int i=10;i>=1;i--) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void newProgram() {
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public static void incrementFor() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void decrementFor() {
		for(int i=15;i>=0;i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static void forLoopWIthBreak() {
		for(int i=10;i<=20;i++) {
			if(i==14) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void forLoopWIthContinue() {
		for(int i=10;i<=20;i++) {
			if(i==14) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
