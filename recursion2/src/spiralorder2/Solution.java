package spiralorder2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<Integer> spiral(int[][] matrix) {
	    // Write your solution here.
			  List<Integer> result = new ArrayList<Integer>();
			  int m = matrix.length;
			  if(m == 0){
				  return result;
			  }
			  int n = matrix[0].length;
			  int left = 0;
			  int right = n - 1;
			  int up = 0;
			  int down = m - 1;
			  while(left < right && up < down){
				  for(int i = left; i <= right; i++){
					  result.add(matrix[up][i]);
				  }
				  for(int i = up + 1; i <= down-1; i++){
					  result.add(matrix[i][right]);
				  }
				  for(int i = right; i >= left; i--){
					  result.add(matrix[down][i]);
				  }
				  for(int i = down - 1; i >= up + 1; i--){
					  result.add(matrix[i][left]);
				  }
				  right--;
				  down--;
				  up++;
				  left++;
				  }
			 if(left > right || up > down){
				 return result;
			 }
			 //one col left
			 if(left == right){
				 for (int i = up; i <= down; i++){
					 result.add(matrix[i][left]);
				 }
			 }
			 //one row left
			 else{
				 for (int i = left;i <= right;i++){
					 result.add(matrix[up][i]);
				 }
			 }
			 return result;
		  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  int [][] a ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		  for(int i = 0; i<s.spiral(a).size(); i++){
			  System.out.print(s.spiral(a).get(i)+" ");
		  }
	  }
}
