package Recursion;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Binary of " + num + "= " + decimaltoBinary(num));
	}
	public static long decimaltoBinary(int num) {
		if(num==1) {
			return 1;
		}
		return (num%2)+(decimaltoBinary(num/2)*10);
	}
}
