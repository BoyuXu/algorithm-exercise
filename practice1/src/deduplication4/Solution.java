package deduplication4;

import java.util.Arrays;

public class Solution {
	  public int[] dedup(int[] array) {
	    // Write your solution here.
	    if(array.length <= 1){
	    	return array;
	    }
	    //s included
	    int slow = 0;
	    for(int fast = 1; fast < array.length; fast++){
	    	if(slow == -1 || array[fast] != array[slow]){
	    		array[++slow] = array[fast];
	    	}
	    	else{
	    		slow--;
	    		while(fast + 1 < array.length && array[fast] == array[fast+1]){
	    			fast++;
	    		}
	    	}
	    }
	    return Arrays.copyOf(array,slow+1);
	  }
	  public static void main(String [] args){
		  Solution s = new Solution();
		  int [] array = {1,2,2,2,3,3,3,2,2,3};
		  System.out.println(Arrays.toString(s.dedup(array)));
	  }

}
