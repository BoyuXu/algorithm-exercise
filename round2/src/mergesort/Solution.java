package mergesort;

import java.util.Arrays;

public class Solution {
	public int[] mergeSort(int[] array) {
	    // Write your solution here.
		if(array == null || array.length <= 1){
			return array;
		}
		int [] copy = new int [array.length];
		divide(array, copy, 0, array.length-1);
		return array;
	}
	private void divide(int [] array, int [] copy, int left, int right){
		if(left >= right){
			return;
		}
		int mid = left + (right - left) / 2;
		divide(array, copy, left, mid);
		divide(array, copy, mid + 1, right);
		merge(array, copy, left, mid, right);
	}
	private void merge(int [] array, int [] copy, int left, int mid, int right){
		for(int x = left; x <= right; x++){
			copy[x] = array[x];
		}
		int i = left;
		int j = mid + 1;
		int k = left;
		while(i <= mid && j <= right){
			if(copy[i] <= copy[j]){
				array[k++] = copy[i++]; 
			}
			else{
				array[k++] = copy[j++];
			}
		}
		while(i <= mid){
			array[k++] = copy[i++];
		}
	}
	public static void main (String [] args){
		Solution s = new Solution();
		int [] array = {1,3,2,5,4};
		System.out.println(Arrays.toString(s.mergeSort(array)));
	}
}
