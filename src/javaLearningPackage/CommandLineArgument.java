package javaLearningPackage;

import java.util.Scanner;

public class CommandLineArgument {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
			int i = sc.nextInt();
			System.out.println(i+2);

	}

}
