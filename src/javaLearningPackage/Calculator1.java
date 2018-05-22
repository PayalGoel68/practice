	package javaLearningPackage;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {

		int a, b, res;
		char choice;
		Scanner scan = new Scanner(System.in);

		System.out.print("1. Addition\n");
		System.out.print("2. Subtraction\n");
		System.out.print("3. Multiplication\n");
		System.out.print("4. Division\n");
		System.out.print("5. Exit\n\n");
		System.out.print("Enter Your Choice : ");
		choice = (char) scan.nextInt();
		System.out.print(choice);
		switch (choice) {
		case '1':
			System.out.print("Enter First Number : ");
			a = scan.nextInt();
			System.out.print("Enter second Number : ");
			b = scan.nextInt();
			res = a + b;
			System.out.print("Answer = " + res);
			break;
		case '2':
			System.out.print("Enter First Number : ");
			a = scan.nextInt();
			System.out.print("Enter Second Number : ");
			b = scan.nextInt();
			res = a - b;
			System.out.print("Answer = " + res);
			break;
		case '3':
			System.out.print("Enter First Number : ");
			a = scan.nextInt();
			System.out.print("Enter Second Number : ");
			b = scan.nextInt();
			res = a * b;
			System.out.print("Answer = " + res);
			break;
		case '4':
			System.out.print("Enter First Number : ");
			a = scan.nextInt();
			System.out.print("Enter First Number : ");
			b = scan.nextInt();
			res = a / b;
			System.out.print("Answer = " + res);
			break;
		default:
			System.out.print("Exit");
			break;
		}
		System.out.print("\n---------------------------------------\n");

	}

}
