package largestcross1;

public class Solution {
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
	      int left[][] = left(matrix,n,m);
	      int right[][] = right(matrix,n,m);
	      int up[][] = up(matrix,n,m);
	      int down[][] = down(matrix,n,m);
	      int [][]leftup = merge(left,up,n,m);
		  int [][]rightdown = merge(right,down,n,m);
	      return result(leftup,rightdown,n,m);
	  }
	  private int[][] merge(int[][]a,int[][]b,int n,int m){
		  int [][] array = new int [n][m];
		  for(int i = 0; i < n; i++){
			  for(int j = 0; j < m; j++){
				  array[i][j] = Math.min(a[i][j], b[i][j]);
			  }
		  }
		  return array;
	  }
	  private int result(int[][] a,int[][] b,int n, int m){
		  int result = 0;
		  for(int i = 0; i< n; i++){
			  for(int j = 0; j < m; j++){
				  int cur = Math.min(a[i][j],b[i][j]);
				  result = Math.max(result, cur);
			  }
		  }
		  return result;
	  }
	  private int [][] left(int[][]matrix, int n, int m){
		  int left[][] = new int[n][m];
		  for(int i = 0; i < n; i++){
			  for(int j = 0; j < m ; j++){
				  if(matrix[i][j] == 1){
					  if(j == 0){
						  left[i][j] = 1;
					  }
					  else{
						  left[i][j] = left[i][j-1]+1;
					  }
				  }
			  }
		  }
		  return left;
	  }
	  private int [][] right(int[][]matrix, int n, int m){
		  int right[][] = new int[n][m];
		  for(int i = n-1; i >= 0; i--){
			  for(int j = m-1; j >= 0 ; j--){
				  if(matrix[i][j] == 1){
					  if(j == m-1){
						  right[i][j] = 1;
					  }
					  else{
						  right[i][j] = right[i][j+1]+1;
					  }
				  }
			  }
		  }
		  return right;
	  }
	  private int [][] up(int[][]matrix, int n, int m){
		  int up[][] = new int[n][m];
		  for(int i = 0; i < n; i++){
			  for(int j = 0; j < m ; j++){
				  if(matrix[i][j] == 1){
					  if(i == 0){
						  up[0][j] = 1;
					  }
					  else{
						  up[i][j] = up[i-1][j]+1;
					  }
				  }
			  }
		  }
		  return up;
	  }
	  private int [][] down(int[][]matrix, int n, int m){
		  int down[][] = new int[n][m];
		  for(int i = n-1; i >= 0; i--){
			  for(int j = m-1; j >= 0 ; j--){
				  if(matrix[i][j] == 1){
					  if(i == n-1){
						  down[i][j] = 1;
					  }
					  else{
						  down[i][j] = down[i+1][j]+1;
					  }
				  }
			  }
		  }
		  return down;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  int [][] array = {{1,1,1,1,1},{1,1,1,1,0},{0,0,0,1,1}};
		  System.out.println(s.largest(array));
	  }
}