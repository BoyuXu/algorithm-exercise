package array0;

import java.util.Arrays;

public class Solution {
	public int [] sort0(int [] array) {
		if (array == null || array.length <= 1) {
			return array;
		}
		int slow = 0;
		int fast = 0;
		while (fast < array.length) {
			if (array[fast] != 0) {
				array[slow++] = array[fast++];
			}else {
				fast++;
			}
		}
		for (int i = slow; i < array.length; i++) {
			array[i] = 0;
		}
		return array;
	}
	public static void main (String [] args) {
		Solution s = new Solution();
		int [] array = {1,2,0,3,0,5};
		System.out.println(Arrays.toString(s.sort0(array)));
	}
}
