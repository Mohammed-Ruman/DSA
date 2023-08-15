package TimeComplexity;

/*
 * Write function to calculate sum and product of array elements
 * calculate time complexity for written function
 */
public class SumProduct {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		sumPro(arr);
	}
		
	public static void sumPro(int[] arr) {	
		int sum=0;                       // O(1)
		int product=1;                   // O(1)
		for(int a:arr) {                 // O(N)
			sum += a;                    // O(1)
			product *= a;                // O(1)
		}
		System.out.println("sum= " + sum); // O(1)
		System.out.println("Product= " + product); // O(1)

	}
}

//Time complexity= O(N)-Linear