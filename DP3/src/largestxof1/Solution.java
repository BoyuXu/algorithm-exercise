package largestxof1;

public class Solution {
	  public int largest(int[][] matrix) {
	    // Write your solution here.
	    int N = matrix.length;
	    int M = matrix[0].length;
	    if(N == 0){
	    	return 0;
	    }
	    if(M == 0){
	    	return 0;
	    }
	    int [][]leftup = leftup(matrix,N,M);
	    int [][]rightdown = rightdown(matrix,N,M);
	    return merge(leftup,rightdown,N,M);
	  }
	  private int merge(int [][] leftup, int [][] rightdown, int n, int m){
		 int result = 0;
		 for(int i = 0; i < n; i++){
			 for(int j = 0; j < m; j++){
				 leftup[i][j] = Math.max(leftup[i][j], rightdown[i][j]);
				 result = Math.max(result, leftup[i][j]);
			 }
		 }
		 return result;
	  }
	  private int [][] leftup(int [][] matrix, int n, int m){
		 int left[][] = new int [n][m];
		 int up[][] = new int [n][m];
		 for(int i = 0; i < n; i++){
			 for(int j = 0; j < m; j++){
				 if(matrix[i][j] == 1){
					 left[n][m] = getnumber(left, i-1, j-1, n, m) + 1;
					 up[n][m] = getnumber(up, i-1, j+1, n, m) + 1;
				 }
			 }
		 }
		 merge(left, up, n, m);
		 return left;
	  }
	  private int [][] rightdown(int [][] matrix, int n, int m){
			 int right[][] = new int [n][m];
			 int down[][] = new int [n][m];
			 for(int i = n - 1; i > 0; i--){
				 for(int j = m - 1; j > 0; j--){
					 if(matrix[i][j] == 1){
						 right[n][m] = getnumber(right, i+1, j-1, n, m) + 1;
						 down[n][m] = getnumber(down, i+1, j+1, n, m) + 1;
					 }
				 }
			 }
			 merge(right, down, n, m);
			 return right;
	  }
	  private int getnumber(int [][] matrix, int i, int j, int n, int m){
		  if(i < 0 || i >= n || j < 0 || j >= m){
			  return 0;
		  }
		  else{
			  return matrix[i][j];
		  }
	  }
}


