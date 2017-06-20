package rotatematrix;

public class Solution {
	  public void rotate(int[][] matrix) {
	    // Write your solution here.
		  int n = matrix.length;
		  if(n <= 1){
			  return;
		  }
		  int round = n/2;
		  for(int level = 0; level < round; level++){
			  int left = level;
			  int right = n - 1 - level;
			  for(int i = left; i < right; i++){
				  int temp = matrix[left][i];
				  matrix[left][i] = matrix[n - 1 - i][left];
				  matrix[n - 1 - i][left] = matrix[n - 1 - left][n - 1 - i];
				  matrix[n - 1 - left][n- 1 - i] = temp;
			  }
		  }
	  }
}