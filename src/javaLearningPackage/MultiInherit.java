package javaLearningPackage;

public class MultiInherit {
	public static void main(String args[]){
		Printable obj = new A2();
		obj.print();
		
	}
}

interface Printable{
	public void print();
}

interface Showable{
	abstract void show();
}

class A2 implements Printable,Showable{

	public void show() {
		System.out.println("Show your moves");
		
	}

	public void print() {
		System.out.println("Print the page");
		
	}
}