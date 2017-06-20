package largestsquare;

public class Solution {
	  public int largest(int[][] matrix) {
	    // Write your solution here.
	    int n = matrix.length;
	    if(n == 0){
	    	return 0;
	    }
	    int result = 0;
	    int [][] largest = new int [n][n];
	    for(int i = 0; i < n;i++){
	    	for(int j = 0; j < n; j++){
	    		if(i == 0 || j == 0 ){
	    			largest[i][j] = matrix [i][j] == 1? 1:0;
	    		}
	    		else if(matrix [i][j] == 1){
	    			largest[i][j] = Math.min(largest[i-1][j], largest[i][j-1]);
	    			largest[i][j] = 1 + Math.min(largest[i-1][j-1], largest[i][j]);
	    		}
	    		result = Math.max(result, largest[i][j]);
	    	}
	    }
	    return result;
	  }
	}
