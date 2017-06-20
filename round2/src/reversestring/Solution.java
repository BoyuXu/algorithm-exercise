package reversestring;
//iterative
public class Solution {
	public String reverse(String input) {
	    // Write your solution here.
		if(input == null || input.length() == 0){
			return input;
		}
		char [] array = input.toCharArray();
		reverse(array, 0, array.length - 1);
		return new String(array);
		}
	private void reverse(char[] input, int left, int right){
		while(left <= right){
			swap(input, left, right);
			left++;
			right--;
		}
	}
	private void swap(char[] array, int i, int j){
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String [] args){
		Solution s = new Solution();
		System.out.println(s.reverse("abble"));
	}
}
