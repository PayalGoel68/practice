package javaLearningPackage;

public class InterfaceCalci {
	public static void main(String args[]){
		SimpleCalculator obj = new Add1();
		obj.operation(4, 6);
		
	}
}

interface SimpleCalculator{
	int operation(int a, int b);
}

class Add1 implements SimpleCalculator{

	@Override
	public int operation(int a, int b) {
		int result = a+b;
		System.out.println("Addition of two numbers:" +result);
		return result;
	}
	
}

class Subtract1 implements SimpleCalculator{

	@Override
	public int operation(int a, int b) {
		int result = a-b;
		System.out.println("Substraction of two numbers:" +result);
		return result;
	}
	
}

class Multiplication1 implements SimpleCalculator{

	@Override
	public int operation(int a, int b) {
		int result = a*b;
		System.out.println("Multiplication of two numbers:" +result);
		return result;
	}
	
}

class Division1 implements SimpleCalculator{

	@Override
	public int operation(int a, int b) {
		int result = a/b;
		System.out.println("Division of two numbers:" +result);
		return result;
	}
	
}