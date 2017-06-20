package quicksort;

import java.util.Arrays;

public class Solution {
	  public int[] quickSort(int[] array) {
	    // Write your solution here
		  if(array == null){
			  return array;
		  }
		  sortMethod(array, 0 , array.length - 1);
		  return array;
	  }
	  private void sortMethod(int [] array, int left, int right){
		  if(left >= right){
			  return;
		  }
		  int pivot = sort(array, left, right);
		  sortMethod(array, left, pivot-1);
		  sortMethod(array, pivot + 1, right);
	  }
	  private int sort(int [] array, int left, int right){
		  int targetIndex = targetIndex(left, right);
		  int target = array[targetIndex];
		  swap(array, targetIndex, right);
		  int i = left;
		  int j = right - 1;
		  while(i <= j){
			  if(array[i] < target){
				  i++;
			  }
			  else if(array[j] > target){
				  j--;
			  }
			  else{
				  swap(array,i,j);
				  i++;
				  j--;
			  }
			  swap(array,i,right);
		  }
		  return i;
	  }
	  private int targetIndex(int left, int right){
		 return left + (int)( Math.random() * (right - left +1));			  		  
	  }
	  private void swap(int[]array, int left,  int right){
		  int temp = array[left];
		  array[left] = array[right];
		  array [right] = temp;			  
	  } 
	  public static void main (String [] args){
			Solution s = new Solution();
			int [] array = {1,3,2,5,4};
			System.out.println(Arrays.toString(s.quickSort(array)));
		}
}
