package Largesumsub;

public class Solution {
	  public int largestSum(int[] array) {
	    // Write your solution here.
	    //d[i] denotes at the end of i, the sum of all above numbers
		int result = 0;
		int cur = array[0];
		for (int i = 1 ; i < array.length; i++){
			cur = Math.max(array[i], cur+array[i]);
			result = Math.max(result, cur);
		}
		return result;
	  }
	}

