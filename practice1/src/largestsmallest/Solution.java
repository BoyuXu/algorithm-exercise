package largestsmallest;

import java.util.Arrays;

public class Solution {
	 public int[] largestAndSmallest(int[] array) {
	    // Write your solution here.
	    // The first element is the largest number,
	    // the second element is the smallest number.
		 
		 // compare array[i] and array[n-1-i] can form the iteration
		int n = array.length;
		for(int i = 0; i < n/2; i++){
			if(array[i] < array[n - 1- i]){
				swap(array, i, n - 1 -i);
			}
		}
		int [] newarray = {largest(array, 0, (n-1)/2), smallest(array, n/2, n-1)};
		return newarray;
	 }
	 private int largest(int [] array, int left, int right){
		 int largest = array[left];
		 for(int i = left + 1; i <= right; i++){
			 largest = Math.max(largest, array[i]);
		 }
		 return largest;
	 }
	 private int smallest(int [] array, int left, int right){
		 int smallest = array[left];
		 for(int i = left + 1; i <= right; i++){
			 smallest = Math.min(smallest, array[i]);
		 }
		 return smallest;
	 }
	 private void swap(int [] array, int i, int j){
		 int temp = array[i];
		 array[i] = array[j];
		 array[j] = temp;
	 }
	 public static void main (String [] args){
		 Solution s = new Solution();
		 int [] array = {1,2,4,5,6,7,8,9,0,11,44,5,33,45};
		 System.out.print(Arrays.toString(s.largestAndSmallest(array)));
	 }
}

