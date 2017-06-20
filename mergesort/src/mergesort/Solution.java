package mergesort;

import java.util.Arrays;

public class Solution {
	public int[] mergeSort(int[] array) {
	    // Write your solution here.
		if (array == null || array.length == 0){
			return array;
		}
		int [] helper = new int[array.length];
		divide(array, helper, 0, array.length - 1);
		return array;
    }
	private void divide(int [] array, int [] helper, int left, int right){
		if (right <= left) {
			return;
		}
		int mid = (right - left)/2 + left;
		divide(array, helper, left, mid);
		divide(array, helper, mid + 1, right);
		merge(array, helper, left, mid, right);
	}
	private void merge(int [] array, int [] helper, int left, int mid, int right) {
		for (int i = left; i <= right; i++) {
			helper[i] = array[i];
		}
		int leftindex = left;
		int rightindex = mid + 1;
		while (leftindex <= mid && right >= rightindex) {
			if (helper[leftindex] <= helper[rightindex]){
				array[left++] = helper[leftindex++];
			}else {
				array[left++] = helper[rightindex++];
			}
		}
		while (leftindex <= mid) {
			array[left++] = helper[leftindex++];
		}
	}
	public static void main (String [] args){
		Solution s = new Solution();
		int [] array = {1,4,6,7,8,2};
		System.out.println(Arrays.toString(s.mergeSort(array)));
	}
}

     
    