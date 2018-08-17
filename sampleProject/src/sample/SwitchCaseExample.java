package sample;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the value1");
		double x = input.nextInt();
		System.out.println("Please Enter the value2");
		double y = input.nextInt();
		System.out.println("Please Enter the Option");
		System.out.println("1: Add ");
		System.out.println("2: Sub ");
		System.out.println("3: Mul ");
		System.out.println("4: Div ");
		System.out.println("5: Mod ");
		int option = input.nextInt();
		//double result = 0;
		switch (option) {
		case 1:
			System.out.println("Result = "+( x + y));
			break;
		case 2:
			System.out.println("Result = "+( x - y));
			break;
		case 3:
			System.out.println("Result = "+( x * y));
			break;
		case 4:

			System.out.println("Result = "+( x / y));
			break;
		case 5:
			System.out.println("Result = "+( x % y));
			break;
		default:
			System.out.println("Wrong Selection");
		}

	}
}
