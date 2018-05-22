package javaLearningPackage;



class Animal {
	public void eat() {
		System.out.println("eating");
	}
}

	class Cat extends Animal {
		public void cry() {
			System.out.println("Crying");
		}
	}


public class InheritancePrint {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		obj.cry();

	}

}
