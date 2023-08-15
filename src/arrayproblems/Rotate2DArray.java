package arrayproblems;

public class Rotate2DArray {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println("Transpose of array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}
		
		//logic to rotate matrix by +90 degree or clockwise
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length/2;j++) {
//				int temp=arr[i][j];
//				arr[i][j]=arr[i][arr[i].length-1];
//				arr[i][arr[i].length-1]=temp;
//			}
//		}
//		System.out.println("Rotate by +90 degree");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j] + "|");
//			}
//			System.out.println();
//		}
		
		//Logic to rotate matrix by -90 or anticlockwise
		for(int i=0;i<arr.length/2;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[arr[i].length-1][j];
				arr[arr[i].length-1][j]=temp;
			}
		}
		System.out.println("Rotate by -90 degree");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}
	}
}
