package spiralorder1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<Integer> spiral(int[][] matrix) {
	    // Write your solution here.
		List<Integer> list = new ArrayList<Integer>();
		recursivetravers(matrix, 0, matrix.length, list);
	  return list;
	  }
	  private void recursivetravers (int[][] matrix, int offset, int size, List<Integer> result)
	  {
		  //base case: size 0 and size 1!!
		  if(size == 0){
			  return;
		  }
		  if(size == 1){
			  result.add(matrix[offset][offset]);
			  return;
		  }
		  for(int i = 0; i < size-1; i++){
			  result.add(matrix[offset][offset+i]);
		  }
		  for(int i = 0; i < size-1; i++){
			  result.add(matrix[offset+i][size-1+offset]);
		  }
		  for(int i = size - 1; i > 0; i--){
			  result.add(matrix[size-1+offset][offset+i]);
		  }
		  for(int i = size - 1; i > 0; i--){
			  result.add(matrix[offset+i][offset]);
		  }
		  recursivetravers (matrix, offset+1, size - 2, result);
	 }
}