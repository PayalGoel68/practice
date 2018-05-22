package javaLearningPackage;

public class Constructor1 {

	int age;
	public Constructor1(String schoolname) {
		System.out.println("School Name is:" +schoolname);
	}
	
	public void set(int age1){
		age=age1;
	}

	public int get(){
		System.out.println(age);
		return age;
	}
	public static void main(String[] args) {
		
	Constructor1 studentdetail= new Constructor1("kendriyaVidyalya");
	//studentdetail.Constructor1();	
	studentdetail.set(500);
		studentdetail.get();
		System.out.println("variable value :" +studentdetail.age);
	}

}
