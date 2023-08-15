package Recursion;

import java.util.Scanner;

public class ProductofArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++) {
		
		arr[i]=sc.nextInt();
		System.out.println(i);
	}
	System.out.println(arr.length);
	System.out.println("Product of array= " + productofArray(arr,arr.length-1));
}

public static int productofArray(int arr[], int N) {
	if(N<0) {	
		return 1;
	}	
return arr[N]*productofArray(arr, N-1);
}
}