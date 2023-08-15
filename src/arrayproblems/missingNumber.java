package arrayproblems;

/*
 * Question: Write a function to find the missing number in a given integer array of 1 to 100.
 * myArray = {1,2,3,4,6}
   missingNumber(myArray, 6) // 5
 */
public class missingNumber {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7,8,9,10};
		System.err.println(missingNumber(arr, 10));
		
	}
	
	static int missingNumber(int[] arr, int totalCount) {
	int requiredSum=totalCount*(totalCount+1)/2;
	int actualSum=0;
	for(int element:arr) {
		actualSum+=element;
	}
	return requiredSum-actualSum;
	}
}
//Logic
//first find the sum of n natural number using formula n*(n+1)/2;
//find the sum of all elements of array
//subtract sum of natural number-sum of array