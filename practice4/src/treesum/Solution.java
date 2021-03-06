package treesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	  public List<List<Integer>> allTriples(int[] array, int target) {
	    // Write your solution here.
		  List<List<Integer>> result = new ArrayList<List<Integer>>();
		  Arrays.sort(array);
		  for (int i = 0; i < array.length; i++){
			  if( i > 0 && array[i] == array[i - 1]){
				  continue;
			  }
			  int left = i + 1;
			  int right = array.length - 1;
			  while(left < right){
				  int temp = array[left] + array[right];
				  if(temp + array[i] == target){
					  result.add(Arrays.asList(array[left], array[i], array[right]));
					  left++;
					  while(left < right && array[left] == array[left - 1]){
						  left++;
					  }
				  }else if(temp + array[i] < target){
					  left++;
				  }else{
					  right--;
				  }
			  }
		  }
		  return result;
	  }
}

