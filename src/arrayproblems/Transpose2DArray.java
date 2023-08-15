package arrayproblems;

import java.util.Arrays;

public class Transpose2DArray {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[0].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}
	}
}
/*
 * Transpose of Matrix of 2d array: interchanging rows into columns
 * and column into rows is called transpose of matrix
 */
