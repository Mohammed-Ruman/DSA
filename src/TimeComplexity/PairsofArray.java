package TimeComplexity;

/*
 * Write function to print of array elements in pairs
 * calculate time complexity for written function
 */

public class PairsofArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		pairs(arr);
	}
	public static void pairs(int[] arr) {
		for(int a:arr) {      //O(N)
			for(int b:arr) {  //O(N)
				System.out.println(a+""+b);
			}
		}
	}
}

//Time complexity=O(N*N)=O(N^2)-Quadratic