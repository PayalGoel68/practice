package javaLearningPackage;

public class PrePostIncrement {

	public static void main(String[] args) {
		/*int a = 5;
	    int i;
		i=++a + ++a + a++;
	System.out.println(i);*/

		int j =0;
		int r=0;        
		for(int v = 0; v<10; ++v) { 
			++r;
			j++;
			System.out.println(j+" "+r);
		}
	}
}
