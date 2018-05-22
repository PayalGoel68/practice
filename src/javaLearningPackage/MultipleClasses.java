package javaLearningPackage;

class FirstClass{
	int a;
	//String name;
	FirstClass obj1;
	public void set(int b){
		a=b;
	}

	public void get(){
		System.out.println("value :" +a);
		//System.out.println("String :" +name);
	}
}

public class MultipleClasses {

	public static void main(String[] args) {
		/*FirstClass obj1= new FirstClass();
	obj1.set(2, "Payal");
	obj1.get();
	//System.out.println(obj1.get());*/

		//MultipleClasses obj2= new MultipleClasses();
		FirstClass obj1= new FirstClass();
	    obj1.set(2);
		obj1.get();

		//System.out.println(obj2.get());
	}


}



