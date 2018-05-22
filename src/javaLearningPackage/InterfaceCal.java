package javaLearningPackage;

public class InterfaceCal {

	public static void main(String[] args) {
		Calci obj = new Add();
		Calci obj1 = new Subtract();
		Calci obj3 = new Multiplication();
		Calci obj4 = new Division();
		obj.solve();
		obj1.solve();
		obj3.solve();
		obj4.solve();

	}

}

interface Cal {
	int solve();
}

class Calci implements Cal {

	@Override
	public int solve() {
		System.out.println("In Parent");
		return 0;

	}
}

class Add extends Calci {

	public int solve() {
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println("Addition of two number:" + c);
		return c;
	}

	public void test() {
		System.out.println("inside test");
	}
}

class Subtract extends Calci {
	public int solve() {
		int a = 4;
		int b = 2;
		int c = a - b;
		System.out.println("Substraction of two numbers:" + c);
		return c;
	}
}

class Division extends Calci {
	public int solve() {
		int a = 4;
		int b = 2;
		int c = a / b;
		System.out.println("Division of two numbers:" + c);
		return c;
	}
}

class Multiplication extends Calci {
	public int solve() {
		int a = 4;
		int b = 2;
		int c = a * b;
		System.out.println("Multiplication of two numbers:" + c);
		return c;
	}
}