package javaLearningPackage;

public class Typecasting {

	public static void main(String[] args) {
		Vehicle obj = new Car(); 
		obj.get();
	}

}

class Vehicle{
	public void get(){
		System.out.println("Vehicle description");
	}
}

class Car extends Vehicle{
	public void get1(){
		System.out.println("Car description");
	}
}
