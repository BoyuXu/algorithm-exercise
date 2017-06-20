package largestsubmatrixsum;

public class Solution {
	  public int largest(int[][] matrix) {
	    // Write your solution here.
		  int N = matrix.length;
		  int M = matrix[0].length;
		  int result = getsumNumber(matrix, N, M);
		  return result;
	  }
	  private int getsumNumber(int [][] matrix, int n, int m){
		  int [][] sum = new int [n][m];
		  int result = Integer.MIN_VALUE;
		  sum [0][0] = matrix[0][0];
		  if(n==1 && m == 1){
			  result = sum[0][0];
		  }
		  else if(n == 1){
			  for(int j = 1; j < m; j++){
				  sum [0][j] = sum[0][j-1] + matrix[0][j];
				  result = Math.max(sum[0][j], result);
			  }
		  }
		  else if(m == 1){
			  for(int i = 1; i < n; i++){
				  sum [i][0] = sum[i-1][0] + matrix[i][0];
				  result = Math.max(sum[i][0], result);
			  }
		  }
		  else{
			  for(int i = 0; i < n; i++){
				  for(int j = 0; j < m; j++){
					  if(i==0 && j == 0){
						  sum[0][0] = matrix[0][0];
					  }
					  else if( i == 0 ){
						  sum [0][j] = sum[0][j-1] + matrix[0][j];
					  }
					  else if (j == 0){
						  sum [i][0] = sum[i-1][0] + matrix[i][0];
					  }
					  else{
						  sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + matrix[i][j];
					  }
				  result = Math.max(result , sum[i][j]);
				  }
			  }
		  }
		  return result;
	  }
	  public static void main(String [] args){
		  Solution s = new Solution();
		  int [][] matrix = {{-1,-2,-3},{-4,-3,-2},{-3,0,-1}};
		  System.out.println(s.getsumNumber(matrix, 3, 3));
	  }
}

