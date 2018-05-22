package javaLearningPackage;

 interface Shapes1 {
	public void size();
}

class Rectangle implements Shapes1{

	@Override
	public void size() {
		System.out.println("12");
	}
	
}

class Shapes{
	public static void main(String[] args){
		Shapes1 obj = new Rectangle();
		obj.size();
	}
}