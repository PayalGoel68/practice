package javaLearningPackage;

//import javaLearningPackage.Shape.Triangle;

class Shape {
	int a;
	int b;

	public void get(int a, int b) {
		int c;
		c = a * b;
		System.out.println("Rectangle Size: " + c);

	}
}

class Triangle extends Shapes {
	int x, y, z;

	public void get(int d, int e, int f) {
		d = x;
		e = y;
		f = z;
		int p;
		p = x * y * z;
		System.out.println("Triangle Size:" + p);
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		Triangle obj1 = new Triangle();
		obj1.get(1, 2, 4);
		

	}

}
