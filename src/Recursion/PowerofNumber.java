package Recursion;

import java.util.Scanner;

public class PowerofNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	System.out.println("Enter the power");
	int power=sc.nextInt();
	PowerofNumber res=new PowerofNumber();
	System.out.println("Result= " + res.powerofNumber(num,power));
}
	public int powerofNumber(int num,int power) {
		if(power<0) {
			return -1;
		}
		
		if(power==0) {
			return 1;
		}
		
		return num*powerofNumber(num, power-1);
		
	}
}
