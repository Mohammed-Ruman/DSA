package arrayproblems;

import java.util.Arrays;

/*
 * Question:Given an array, write a function to get first, second best scores from the array.
	Array may contain duplicates.
	
	Example
	myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
	firstSecond(myArray) // 90 87
 */
public class BestScore {
	public static void main(String[] args) {
	Integer[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,90};
	System.out.println(firstSecond(myArray));
	}

	static String firstSecond(Integer[] myArray) {
	    Arrays.sort(myArray);
	    Integer first=myArray[myArray.length-1];
	    Integer second=null;
	    for(int i=myArray.length-1;i>=0;i--) {
	    	if(myArray[i]!=first) {
	    		second=myArray[i];
	    		break;
	    	}
	    }
	    return first +" "+ second;
	  }

}
