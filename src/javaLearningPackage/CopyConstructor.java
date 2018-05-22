package javaLearningPackage;

public class CopyConstructor {
		int a;
		String Name;

			public CopyConstructor(int b,String LastName) {
				a=b;
				Name=LastName;
			}
			
			public CopyConstructor(CopyConstructor obj1){
				a=obj1.a;
				Name=obj1.Name;
			}
			
			public int getvalue(){
				return a;
			}
			
			public String getvalue1(){
				return Name;
			}


	public static void main(String[] args) {
		CopyConstructor obj1 = new CopyConstructor(3,"Payal");
		CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println(obj1.getvalue());
        System.out.println(obj1.getvalue1());
        System.out.println(obj2.getvalue());
        System.out.println(obj2.getvalue1());
	}

}
