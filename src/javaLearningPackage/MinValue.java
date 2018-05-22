package javaLearningPackage;

public class MinValue {

	public static void main(String[] args) {
		int[] a={1006,300,500,1000,9000};
int i,min;
min = a[0];
for(i=0;i<a.length;i++){
	if(a[i]<min){
		min=a[i];
	}
}
System.out.println(min);
}
}