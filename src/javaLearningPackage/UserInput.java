package javaLearningPackage;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
	Addd obj1 = new Addd();
	Subtractt obj2 = new Subtractt();
	Divisionn obj3 = new Divisionn();
	Multiplicationn obj4 = new Multiplicationn();
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int x = scan.nextInt();
//	System.out.println("Enter second number: ");
//	int y = scan.nextInt();
	
	Scanner scan = new Scanner(System.in);

    System.out.println("Simple Calculator");

    System.out.println("\n1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Division");
    System.out.println("4. Multiplication");
    
    int choice = scan.nextInt();
    
    if (choice == 1){
    	
    	obj1.solve(4,2);
    }
    else if(choice == 2){
    	
    	obj2.solve(6,8);
    }
    else if(choice == 3) {
    	obj3.solve(10,2);
    }

    else if(choice == 4){
    	obj4.solve(5,8);
    }
    else if(choice == 5){
    	System.out.println("Exit");
    }
}
}

interface Calll {
	int solve(int a, int b);
}

class Calcii implements Calll {

	@Override
	public int solve(int a, int b) {
		System.out.println("In Parent");
		return 0;

	}
}

class Addd extends Calcii {
	int a,b;
	public int solve(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two number:" + c);
		return c;
	}

	public void test() {
		System.out.println("inside test");
	}
}

class Subtractt extends Calcii {
	int a,b;
	public int solve(int a, int b) {
		int c = a - b;
		System.out.println("Substraction of two numbers:" + c);
		return c;
	}
}

class Divisionn extends Calcii {
	int a,b;
	public int solve(int a, int b) {
		int c = a / b;
		System.out.println("Division of two numbers:" + c);
		return c;
	}
}

class Multiplicationn extends Calcii {
	int a,b;
	public int solve(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of two numbers:" + c);
		return c;
	}
}
