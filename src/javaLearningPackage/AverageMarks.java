package javaLearningPackage;

public class AverageMarks {

	public static void main(String[] args) {
		int avg=0;
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i=0; i<5; i++){
			avg= avg+a[i];
		}
		
		System.out.println("Average:"+ avg/5);

	}

}
