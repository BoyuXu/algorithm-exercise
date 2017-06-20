package deduplication3;

import java.util.Arrays;


public class Solution {
	  public int[] dedup(int[] array) {
	    // Write your solution here.
		  if(array.length <= 1){
			  return array;
		  }
		  //slow excluding
		  int slow = 0;
		  //use beg to insure just only one element,no duplicate
		  int fast = 0;
		 while(fast < array.length){
			 int beg = fast; 
			 while(fast < array.length && array[fast] == array[beg]){
				  fast++;
			  }
			  if(fast - beg == 1){
				  array[slow++] = array[beg];
			  }
		  }
		  return Arrays.copyOf(array, slow);
	  }  
	  public static void main(String [] args){
		  Solution s = new Solution();
		  int [] array = {1,2,2,2,3,3,3};
		  System.out.println(Arrays.toString(s.dedup(array)));
	  }
}
