package javaLearningPackage;

class Animal1{
	public void get(){
		System.out.println("I am Animal");
	}
}

class Dog extends Animal1{
	int b;
	public void get(int a){
		b=a;
		System.out.println("I am Dog");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		Animal1 ani = new Animal1();
		ani.get();
		Animal1 ani2 = new Dog();
		ani2.get();
	}

}

