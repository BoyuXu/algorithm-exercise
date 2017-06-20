package Move0stotheend;

import java.util.Arrays;

public class Solution {
	  public int[] moveZero(int[] array) {
	    // Write your solution here.
		  if(array.length <= 1){
			  return array;
		  }
		  int slow = 0;
		  for(int fast = 0; fast < array.length; fast++){
			  if(array[fast] != 0){
				  array[slow++] = array[fast];
			  }
		  }
		  for(int i = slow; i < array.length; i++){
			  array[i] = 0;
		  }
		  return array;
	  }
	  
	  public static void main (String [] args){
		  Solution s = new Solution();
		  int [] array = {1,2,0,0,3,0};
		  System.out.println(Arrays.toString(s.moveZero(array)));
	  }
}

