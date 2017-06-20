package largeassendingnumber;

import java.util.Arrays;

public class Solution {
	public int longest(int[] array) {
	    // Write your solution here.
	  if(array.length == 0){
		  return 0; 
	  }
	  int [] result = new int[array.length];
	  //M[1]=1
	  //M[i]=1+M[i-1] when:input[i] > input[{i-1]
	  result[0] = 1;
	  for(int i = 1; i < array.length; i++){
		  if(array[i] > array[i-1]){
			  result[i] = 1 + result[i-1];
		  }
		  else{
			  result[i] = 1;
		  }
	  }
	System.out.println(Arrays.toString(result));
	return decide(result); 
	}
	
	private int decide(int [] array){
		if(array.length == 1){
			return 1;
		}
		int a = 0;
		int i = 1;
		while(i < array.length){
			if(array[i] > a){
				a = array[i];
			}
			i++;
		}
		return a;
	}
} 