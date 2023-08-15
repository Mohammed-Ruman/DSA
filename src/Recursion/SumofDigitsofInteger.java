package Recursion;

import java.util.Scanner;

public class SumofDigitsofInteger {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	System.out.println("Sum = " + sumofDigits(num));
	sc.close();
}
public static int sumofDigits(int n) {
	if(n<=0) {
		return 0;
	}
	return n%10+sumofDigits(n/10);
}
}
