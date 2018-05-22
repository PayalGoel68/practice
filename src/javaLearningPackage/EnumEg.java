package javaLearningPackage;



 public class EnumEg {
	enum colorname{Red,Black,Orange,Yellow}
	 colorname a;
	public static void main(String[] args) {
		EnumEg colornameobj = new EnumEg();
		colornameobj.a= EnumEg.colorname.Red; 
System.out.println(colornameobj.a);
	}
 }
 /*enum weekdays{Monday,Tuesday,Wednesday,Friday}
 public class EnumEg {
	 public static void main(String[] args) {
			//EnumEg colornameobj = new EnumEg();
			System.out.println(weekdays.Tuesday);
 }*/
 