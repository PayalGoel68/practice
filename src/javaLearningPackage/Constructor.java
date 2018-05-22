package javaLearningPackage;

public class Constructor {
	   public Constructor(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name );
	   }

	   public static void main(String []args) {
	      // Following statement would create an object myPuppy
	      Constructor myPuppy = new Constructor( "tommy" );
	   }
}
