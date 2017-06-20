package sort1;

import java.util.Arrays;

public class Solution {
		  public int[] quickSort(int[] array) {
			    // Write your solution here
			  if (array == null) {
				  return array;
			  }
				  apartSort(array, 0, array.length-1);
				  return array;
		  }
		  
		  private void apartSort(int [] array, int left, int right) {
			  if (left >= right) {
				  return;
			  }
			  int sortedIndex = sortMethod(array, left, right);
			  apartSort(array, left, sortedIndex);
			  apartSort(array, sortedIndex + 1, right);
		  }
		
		  private int sortMethod(int [] array, int left, int right) {
			  int targetIndex = (int)(left + Math.random()*(right - left + 1));
			  int target = array[targetIndex];
			  swap(array, targetIndex, right);
			  int leftIndex = left;
			  int rightIndex = right - 1;
			  while (leftIndex <= rightIndex) {
				  if (array[leftIndex] < target){
					  leftIndex++;
				  }else {
					  swap(array, leftIndex, rightIndex);
					  rightIndex--;
				  }
			  }
			  swap(array, leftIndex, right);
			  return leftIndex;
		  }
			  //swap method
		  public void swap(int[]array, int left,  int right){
			  int temp = array[left];
			  array[left] = array[right];
			  array [right] = temp;			  			
		  }  
		  public static void main (String [] args){
			  Solution s = new Solution();
			  int [] array = {1,3,5,6,2};
			  System.out.println(Arrays.toString(s.quickSort(array)));
		  }
	}

