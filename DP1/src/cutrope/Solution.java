package cutrope;

import java.util.Arrays;

public class Solution {
	  public int maxProduct(int length) {
	    // Write your solution here.
	    // assumption:;length >= 2
		// 左大段右小段
		  if(length == 2){
			  return 1;
		  }
		  int [] array = new int[length + 1];
		  array [0] = 0;
		  array [1] = 0;
		  array [2] = 1;
		  for(int i = 3; i < array.length; i++){
			  for(int j = 1; j < i; j++){
				  array[i] = Math.max(array[i], Math.max(j, array[j])*(i-j));
			  }
		  }
		  System.out.println(Arrays.toString(array));
		  return array[length];
	  }
	}
