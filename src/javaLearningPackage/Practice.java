package javaLearningPackage;

public class Practice {
	int a;
	
	//Practice(int c){
		
		//System.out.println(c);
	//}
	public void set(int b){
		a=b;
	}
 public void get(){
	 System.out.println(a);
	 //return a;
 }

	
	public static void main(String[] args) {
	Practice obj1= new Practice();
	obj1.set(300);
	obj1.get();
	}

}
