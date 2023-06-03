package javaprogrammingtopics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		calculator(10, 5);
		
	}
	
	public static void case1(int n) {
		int a = n;

		switch(a) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friay"); break;
		case 6: System.out.println("Sunday"); break;
		default: System.out.println("Saturday/invalid");
		}

	}
	
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter a operator: +, -, *, / ");
		String operator = sc.next();
		
		switch(operator) {
		
		case "+":
			System.out.println("Sum of "+num1+" + "+num2+" = "+" "+(num1+num2));
			break;
		case "-":
			System.out.println("Subtraction of "+num1+" - "+num2+" = "+" "+(num1-num2));
			break;
		case "*":
			System.out.println("multiplication of "+num1+" * "+num2+" = "+" "+(num1*num2));
			break;
		case "/":
			System.out.println("division of "+num1+" / "+num2+" = "+" "+(num1/num2));
			break;
		case "%":
			System.out.println("Modulus of "+num1+" % "+num2+" = "+" "+(num1%num2));
			break;
		case "^":
			System.out.println("power of "+num1+" ^ "+num2+" = "+" "+(Math.pow(num1, num2)));
			break;
		default:
			System.out.println("Enter valid operator !");
			
		}	
		again();
	}
	
	public static void again() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want Try again: Yes | No");
		String UserInterest = sc.next();
		
		if(UserInterest.equalsIgnoreCase("Yes")) {
			calculator();
		}
		else if(UserInterest.equalsIgnoreCase("No")) {
			System.out.println("Thanks, visit again.....");
			
		}
	}
	public static void calculator(int a, int b) {
		Scanner sc = new Scanner(System.in);
		
		int num1 =a;
		int num2 =b;
		
		System.out.println("Enter a operator: +, -, *, / ");
		String operator = sc.next();
		
		switch(operator) {
		
		case "+":
			System.out.println("Sum of "+num1+" + "+num2+" = "+" "+(num1+num2));
			break;
		case "-":
			System.out.println("Subtraction of "+num1+" - "+num2+" = "+" "+(num1-num2));
			break;
		case "*":
			System.out.println("multiplication of "+num1+" * "+num2+" = "+" "+(num1*num2));
			break;
		case "/":
			System.out.println("division of "+num1+" / "+num2+" = "+" "+(num1/num2));
			break;
		case "%":
			System.out.println("Modulus of "+num1+" % "+num2+" = "+" "+(num1%num2));
			break;
		case "^":
			System.out.println("power of "+num1+" ^ "+num2+" = "+" "+(Math.pow(num1, num2)));
			break;
		default:
			System.out.println("Enter valid operator !");
			
		}	
	}

}
