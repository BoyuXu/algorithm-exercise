package deduplication;

import java.util.Arrays;

public class Solution2 {
	public int[] dedup(int[] array) {
	    // Write your solution here.
		  if(array.length <= 1){
			  return array;
		  }
		  //slow excluding
		  int slow = 1;
		  for(int fast = 1; fast < array.length; fast++){
			  if(array[fast] == array[slow-1]){
				  continue;
			  }
			  array[slow++] = array[fast];
		  }
		  return Arrays.copyOf(array, slow);
	}
	public static void main(String [] args){
		  Solution s = new Solution();
		  int [] array = {1,1,2,2,3};
		  System.out.println(Arrays.toString(s.dedup(array)));
	  }
}
