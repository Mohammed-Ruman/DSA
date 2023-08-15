package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number");
		int num=sc.nextInt();
		long result=factorial(num);
		System.err.println(  num + "!" + " = " +result);
		}
	}
	public static long factorial(int num) {
		if(num<0) {
			return 0;
		}
		
		if(num==0 || num==1 ) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}
}
