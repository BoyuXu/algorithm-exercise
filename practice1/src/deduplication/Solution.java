package deduplication;

import java.util.Arrays;

public class Solution {
	  public int[] dedup(int[] array) {
	    // Write your solution here.
		  if(array.length <= 1){
			  return array;
		  }
		  int slow = 0;
		  //left part including slow
		  for(int fast = 1; fast < array.length; fast++ ){
			  if(array[fast] == array[slow]){
				  continue;
			  }
			  else{
				 array[++slow] = array[fast];
			  }
		  }
		  return Arrays.copyOfRange(array,0,slow+1);
	  }
	  public static void main(String [] args){
		  Solution s = new Solution();
		  int [] array = {1,1,2,2,3};
		  System.out.println(Arrays.toString(s.dedup(array)));
	  }
}
