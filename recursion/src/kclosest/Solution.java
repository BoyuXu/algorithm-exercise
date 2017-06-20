package kclosest;

public class Solution {
	  public int[] kClosest(int[] array, int target, int k) {
		    // Write your solution here
		    if (array == null || array.length == 0){
		    	return array;
		    }
		    int left = largestsmallerequal(array, target);
		    int right = left + 1;
		    int [] result = new int [k];
		    for (int i=0; i<k ;i++){
		    	// 向左的情况：1.右指针越线 2.左指针没越线且值相差小
		    	if(right >= array.length || left >= 0 && target - array[left] <= array[right] - target ){
		    		result[i] = array[left--];
		    	}
		    	else{
		    		result[i] = array[right++];
		    	}
		    }
		    return result;
	  }
	  private int largestsmallerequal(int [] array, int target){
		  int left = 0;
		  int right = array.length - 1;
		  while(left < right - 1){
			int  mid = (right - left)/2 + left; 
		  if(array[mid] <= target){
			  left = mid;
		  }else{
			  right = mid;
	        }
		  }
		  // ?
		  if(array[right] <= target){
			  return right;}
		  if(array[left] <= target){
			  return left;}
		  // cannot find
		  return -1;
		  }
}
