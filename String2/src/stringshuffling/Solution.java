package stringshuffling;

import java.util.Arrays;

public class Solution {
	public int[] reorder(int[] array) {
		// Write your solution here.
		if(array.length % 2 == 0){
			shuffling(array, 0 ,array.length - 1);
		}else{
			shuffling(array, 0, array.length - 2);
		}
		return array;
	}
	private void shuffling(int [] array, int left, int right){
		if(right - left <= 1){
			return;
		}
		int mid = left + (right - left + 1)/2;
		int leftmid = left + (right - left + 1) / 4;
		int rightmid = left + (right - left + 1) * 3 / 4;
		reverse(array, leftmid, mid - 1);
		reverse(array, mid, rightmid - 1);
		reverse(array, leftmid, rightmid - 1);
		shuffling(array, left,left + 2 * (leftmid - left) - 1);
		shuffling(array,left + 2 * (leftmid - left), right);
	}
	private void reverse(int [] array, int left, int right){
		while(left < right){
			swap(array, left, right);
			left++;
			right--;
		}
	}
	private void swap(int [] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main (String [] args){
		Solution s = new Solution();
		int [] array = {1,2,3,1,2,3};
		System.out.print(Arrays.toString(s.reorder(array)));
	}
}
