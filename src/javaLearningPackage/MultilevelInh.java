package javaLearningPackage;

public class MultilevelInh {
	public static void main(String args[]){
		C obj = new C();
		obj.print();
	}
}
 

class A1{
	public void print(){
		System.out.println("Print A");
	}
}

class B extends A1 {
	public void print(){
		System.out.println("Print B");
	}
}

class C extends B{
	
	public void print(){
		System.out.println("Print C");
	}
}