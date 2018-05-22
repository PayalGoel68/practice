package javaLearningPackage;

public class PassingArrayInMethod {

	public static void main(String[] args)
    {
 	 double[] a = {5.3, 3.4 , 4.5, 5.6, 1.2, 7.8, 8.9 }; 
  
 	 int i;              
	 double min;         
      
       min = a[0];        

	 for ( i = 0 ; i < a.length ; i++ )
 	 {
 	    if ( a[i] < min )
 	    {
 	      min = a[i];  
 	                     
 	    }
 	 }
  
 	 System.out.println( min );   
    }

}
