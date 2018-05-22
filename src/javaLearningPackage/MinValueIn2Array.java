package javaLearningPackage;

public class MinValueIn2Array {

	public static void main(String[] args) {
		int[] a={3,4,5,6};
		int[] b={10,20,30,40};
		
	int min1,min2,i,j;
	min1=a[0];
	min2=b[0];
	
	for(i=0;i<a.length;i++){
		if(a[i]<min1){
			min1=a[i];
		}
	}
 
	for(j=0;j<b.length;j++){
		if(b[j]<min2){
			min2=b[j];
		}
	}
	System.out.println(min1);
	System.out.println(min2);
	}

}
