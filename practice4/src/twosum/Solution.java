package twosum;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public boolean existSum(int[] array, int target) {
	    // Write your solution here.
		  Set<Integer> set = new HashSet<Integer>();
		  for(int i = 0; i < array.length; i++){
			  if(set.contains(target - array[i])){
				  return true;
			  }
			  set.add(array[i]);
		  }
		  return false;
	  }
	  
	  public static void main(String [] args){
		  Solution s = new Solution();
		  int [] array = {1,2,2,3};
		  System.out.println(s.existSum(array, 4));
	  }
}

