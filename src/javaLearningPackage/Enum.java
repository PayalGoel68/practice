package javaLearningPackage;



public class Enum {
	 monthName size;
		 enum monthName{
			jan,feb,march,april,may,june,july,aug,sep,oct,nov,dec
		}
		 
		public static void main(String[] args) {
			Enum obj1= new Enum();
		
	obj1.size= Enum.monthName.july;
	System.out.println("Month"+ ":" +obj1.size);
		}

	}