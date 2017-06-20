package reversestring;

public class Solution {
	public String rebursiveway (String s){
		if(s == null || s.length() == 0){
			return s;
	    }
		char [] array = s.toCharArray();
		reverseString(array, 0, array.length);
		return new String(array);
	}
	public void reverseString(char [] array, int right, int left){
		while (left <= right){
			swap(array, right, left);
			right++;
			left--;
		}
		return ;
	}
	private void swap(char [] array, int right, int left){
		 char temp = array[right];
		 array[left] = array[right];
		 array[right] = temp;
	}
}
