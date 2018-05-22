package javaLearningPackage;

public class ArrayMethodPassing {
	 public static void minArray( double[] a )
	   {
	      int i;            
	      double min; 
	        
	      min = a[0];       

	      for ( i = 1 ; i < 3 ; i++ ) //3=a.length
	      {
	         if ( a[i] < min )
	         {
	           min = a[i];  
	         }
	      }
	    //return(min);
	      System.out.println(min);
	   }
	 
	 public static double totalValue(double[] a){
		 double total;
		 total= a[0]+a[1]+a[2]+a[3];
		//System.out.println(total);
		 return total;
	 }


	public static void main(String[] args) {
		double[] a={1.2,2.4,3.5,4.5};
	//System.out.println(minArray(a));
		ArrayMethodPassing.minArray(a);
		System.out.println(ArrayMethodPassing.totalValue(a));
	}

}
