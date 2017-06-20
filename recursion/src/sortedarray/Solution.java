package sortedarray;

public class Solution {
		  public int[] search(int[][] matrix, int target) {
		    // Write your solution here.
		    int[] result = new int[] {-1, -1};
		    if(matrix [0].length == 0 || matrix.length == 0){
		    	return result;
		  }
		    int row = find1 (matrix, 0, matrix.length - 1, target);
		    if (row == -1){
		    	return result;
		    }
		    int col = find2 (matrix [row], 0, matrix[row].length - 1, target);
		    if (col == -1){
                return result;
		  }
		     result[0] = row;
		     result[1] = col;
		     return result;
          }
		  private int find1(int[] [] matrix, int left, int right, int target){
			   while (left <= right){
                  int mid = left + (right - left)/2;
                  if (matrix [mid][0]> target){
                     right = mid - 1 ;
		          }
                  else left = mid + 1;
			   }
			   return right;
		  }
		  
		  private int find2(int [] array, int left, int right, int target){
                while (left <= right){
                	 int mid = left + (right - left)/2;
                     if (array[mid] == target){
                    	 return mid;
                     }
                     if (array[mid] > target){
                        right = mid - 1 ;
   		          }
                     else left = mid + 1;
               }
		       return -1;
          }
}
		  
