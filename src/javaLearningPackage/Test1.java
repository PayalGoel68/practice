package javaLearningPackage;

public class Test1 {
	int a=1;
	public void get(){
		int a=2;
		System.out.println(a++);
	}
	public static void main(String[] args){
	
Test1 obj= new Test1();
obj.get();
obj.get();
obj.get();
}
}