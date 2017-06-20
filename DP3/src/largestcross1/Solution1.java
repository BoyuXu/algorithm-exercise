package largestcross1;

public class Solution1 {
	  public int largest(int[][] matrix) {
		 // Write your solution here.
		    int n = matrix.length;
		    if(n==0){
			    return 0; 
		    }
	      int m = matrix[0].length;
	      if(m == 0){
	    	  return 0;
	      }
      int[][] leftup = leftup(matrix, n, m);
      int[][] rightdown = rightdown(matrix,n,m);
      return merge(leftup,rightdown,n,m);
	  }
	  private int merge(int[][]leftup,int[][]rightdown,int n, int m) {
	      int result = 0;
	      for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            leftup[i][j] = Math.max(leftup[i][j],rightdown[i][j]);
	            result = Math.max(leftup[i][j],result);
	        }
	      }
	      return result;
	  }
	  private int[][] leftup(int [][] matrix, int n, int m) {
	      int [][] left = new int [n][m];
	      int [][] up = new int [n][m];
	      for (int i = 0; i < n; i++) {
	          for (int j = 0; j < m; j++) {
	              if (matrix[i][j] == 1) {
	                  if (i == 0 && j == 0) {
	                     left[i][j] = 1;
	                     up[i][j] = 1;
	                  }else if (i == 0) {
	                      up[i][j] = 1;
	                      left[i][j] = 1 + left[i][j-1];
	                  }else if (j == 0) {
	                     left[i][j] = 1;
	                     up[i][j] = 1 + up[i-1][j];
	                  }else {
	                     left[i][j] = 1 + left[i][j-1];
	                     up[i][j] = 1 + up[i-1][j];
	                  }
	              }
	          }
	      }
	      merge(left, up, m, n);
	      return left;
	  }
	  private int[][] rightdown(int [][] matrix, int n, int m) {
	      int [][] right = new int [n][m];
	      int [][] down = new int [n][m];
	      for (int i = n - 1; i >= 0; i--) {
	          for (int j = m - 1; j >= 0; j--) {
	              if (matrix[i][j] == 1) {
	                  if (i == n - 1 && j == m - 1) {
	                     right[i][j] = 1;
	                     down[i][j] = 1;
	                  }else if (i == n - 1) {
	                      down[i][j] = 1;
	                      right[i][j] = 1 + right[i][j+1];
	                  }else if (j ==  m - 1) {
	                      right[i][j] = 1;
	                      down[i][j] = 1 + down[i+1][j];
	                  }else {
	                      right[i][j] = 1 + right[i][j+1];
	                      down[i][j] = 1 + down[i+1][j];
	                  }
	              }
	          }
	      }
	      merge(right, down, m, n);
	      return right;
	  }
}