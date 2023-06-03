package javaprogrammingtopics;

public class ObjectArrays {

	public static void main(String[] args) {
		ObjectArraysExamples();
	}
	
	public static void ObjectArraysExamples() {
		Object a[] = {10,2.2,1.2587,'a',"Welcome",true};
		for(Object i:a) {
			System.out.println(i);
		}
	}

}
