package TimeComplexity;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length/2;i++) { //O(N/2)
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1 - i]=temp;
		}
//		for(int a:arr)
//			System.out.println(a);
    System.out.println(Arrays.toString(arr)); 
	} 	
		
}
//Time complexity=O(N)