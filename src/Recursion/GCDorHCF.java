package Recursion;

import java.util.Scanner;

public class GCDorHCF {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int result= num1>=num2? gcdhcf(num1,num2):gcdhcf(num2,num1);
	System.out.println("GCD/HCF= " + result);
}
public static int gcdhcf(int a, int b) {
	
	if(b==0) {
		return a;
	}
	
	return gcdhcf(b, a%b);
	
}
}
