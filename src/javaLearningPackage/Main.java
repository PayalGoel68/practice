package javaLearningPackage;

class CBV {
	int a=2;
	public void set(int b){
		a=b;
	}

	public int get(){
		return a;
	}
}

class Test{
	public void print(CBV obj1){
		//temp= obj1.set(2000);
		obj1.set(200);
	}
}

class Main{
	public static void main(String args[]) {
		CBV obj1 = new CBV();
		obj1.set(100);
		obj1.get();
		//System.out.println(obj1.get());
		Test obj2 = new Test();
		obj2.print(obj1);
		System.out.println(obj1.get());


	}
}



