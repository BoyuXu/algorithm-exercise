package spiralorder2;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static class Solution {
		  public List<Integer> spiral(int[][] matrix) {
		    // Write your solution here.
			  int m = matrix.length;
			  int n = matrix[0].length;
			  List<Integer> result = new ArrayList<Integer>();
			  recursivetravers(matrix, 0, m, n, result);
			  return result;
		  }
		  private void recursivetravers(int [][] matrix, int offset, int m, int n, List<Integer> result){
			  if(m <= 0 || n <= 0){
				  return;
			  }
			  if(m == 1){
				  for(int i = 0; i< n - 1; i++){
					  result.add(matrix[0][i]);
				  }
			  }
			  if(n == 1){
				  for(int i = 0; i< m - 1; i++){
					  result.add(matrix[i][0]);
				  }
			  }
			  for(int i = 0; i < n - 1; i++){
				  result.add(matrix[offset][offset+i]);
			  }
			  for(int i = 0; i< m - 1; i++){
				  result.add(matrix[offset+i][n-1+offset]);
			  }
			  for(int i = n - 1; i > 0; i--){
				  result.add(matrix[m-1+offset][i+offset]);
			  }
			  for(int i = m - 1; i > 0; i--){
				  result.add(matrix[i+offset][offset]);
			  }
			  recursivetravers(matrix, offset+1, m-2, n-2, result);
		  }
		  public static void main (String [] args){
			  	Solution s = new Solution();
			  	int [][] a ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			  	for(int i = 0; i<s.spiral(a).size(); i++){
			  		System.out.print(s.spiral(a).get(i)+" ");
			  	}
		  }
	}

}
