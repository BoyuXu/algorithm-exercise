package reversesentencebyword;

public class Solution {
	public String reverseWords(String input) {
		if(input == null || input.length() == 0){
			return input;
		}
		char [] array = input.toCharArray();
		reverseletters(array, 0 ,array.length - 1);
		reverseword(array);
		return new String(array);
	}
	  private void reverseletters(char[] array, int left, int right){
		  if(left >= right){
			  return;
		  }
		  swap (array, left, right);
		  reverseletters(array, left+1, right-1);
	  }
	  private void reverseword(char[] array){
		  int slow = 0;
		  for(int fast = 0; fast < array.length; fast++){
			  //start
			  if (array[fast]!=' ' && (fast == 0 || array[fast-1] == ' ' )){
				  slow = fast;
			  }
			  //end
			  if(array[fast]!=' ' && ( fast == array.length-1 || array[fast+1] == ' ')){
				  reverseletters(array, slow, fast);
			  }
		  }
	  }
	private void swap(char[] array, int i, int j){
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String [] args){
		Solution s = new Solution();
		System.out.println(s.reverseWords("I love you"));
	}
}
