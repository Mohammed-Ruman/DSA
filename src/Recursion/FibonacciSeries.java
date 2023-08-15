package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("-1");
			
		}else {
		for(int i=0;i<=num;i++) {
		System.out.print(fib(i) + ",");
		}
		}
	}
	public static int fib(int num) {
		
		
		if(num==0 || num==1) {
			
			return num;
		}
		
		
		return fib(num-2)+fib(num-1);
	}
	
}
