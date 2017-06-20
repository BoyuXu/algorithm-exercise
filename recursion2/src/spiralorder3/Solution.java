package spiralorder3;

import java.util.Arrays;

public class Solution {
	  public int[][] spiralGenerate(int m, int n) {
	    // Write your solution here.
		int [][] matrix = new int [m][n];
	    if(m == 0){
	    	return matrix;
	    }
	    int num = 1;
	    int left = 0; 
	    int right = n-1;
	    int up = 0;
	    int down = m - 1;
	    while(left < right && up < down){
	    	for (int i = left; i <= right; i++){
	    		matrix [up][i] = num++; 
	    	}
	    	for (int i = up+1; i <= down - 1;i++){
	    		matrix [i][right] = num++;
	    	}
	    	for (int i = right; i >= left; i--){
	    		matrix [down][i] = num++;
	    	}
	    	for (int i = down-1; i >= up + 1; i--){
	    		matrix [i][left] = num++;
	    	}
	    	up++;
	    	down--;
	    	right--;
	    	left++;
	    }
	    if(left > right || up > down){
	    	return matrix;
	    }
	    //one col left
	    if(left == right){
	    	for (int i = up; i <= down; i++)
	    		matrix [i][left] = num++;
	    }
	    // one row left
	    else{
	    	for (int i = left; i <= right; i++){
	    		matrix [up][i] = num++;
	    	}
	    }
	    return matrix;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(Arrays.deepToString(s.spiralGenerate(3, 4)));
	  }
	}
