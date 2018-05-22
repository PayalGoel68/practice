package javaLearningPackage;

public class CallByValue {

	static int a=5;
	public void set(int b){
		a=b;

	}

	public int get(){
		return a;
	}

	public static void main(String[] args) {
		CallByValue obj1 = new CallByValue();
		CallByValue obj3 = new CallByValue();
		CallByValue obj2 = new CallByValue();
		obj1.set(100);
	obj2.set(200);
	obj3.set(300);
		System.out.println(obj1.get());
	}

}
