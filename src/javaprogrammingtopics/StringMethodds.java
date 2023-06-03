package javaprogrammingtopics;

public class StringMethodds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringMethods();
	}

	public static void stringMethods() {
		String s= "Welcome";
		System.out.println(s.length());

		//concatanation
		String s1="Hello";
		String s2=" World";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println("Hello"+" World");
		System.out.println("Hello".concat(" World"));

		//Equals or Equals ignore - Comparing two strings
		String s3 = "WELCOME";
		String s4 = "welcome"; 
		System.out.println(s3.equals(s4)); //return false
		System.out.println(s3.equalsIgnoreCase(s4)); //return true

		//contains()
		System.out.println(s3.contains("COm")); //false
		System.out.println(s4.contains("com")); //true

		//substring()
		System.out.println(s4.substring(0, 7));
		
		//replace()
		System.out.println(s4.replace('e', 'y'));
		System.out.println(s4.replaceAll("come", "l camel"));

	}



}
