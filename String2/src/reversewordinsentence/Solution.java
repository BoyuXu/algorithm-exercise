package reversewordinsentence;

public class Solution {
	  public String reverseWords(String input) {
		    // Write your solution here.
		  if(input == null || input.length()<=1 ){
			  return input;
		  }
		  char [] array = input.toCharArray();
		  reverseletters(array, 0, array.length-1);
		  reversewords(array);
		  return new String(array);
	  }
		    //step 1: reverse all letters
		  private void reverseletters(char[] array, int left, int right){
			  if(left >= right){
				  return;
			  }
			  swap (array, left, right);
			  reverseletters(array, left+1, right-1);
			
		  }
		    //step 2: reverse each word in sentence 
		  private void reversewords(char[] array){
			  int slow = 0;
			  for(int fast = 0; fast < array.length; fast++ ){
				  //start
				  if (array[fast]!=0 && (array[fast-1] == ' ' || fast == 0)){
					  slow = fast;
				  }
				  //end
				  if(array[fast]!=0 && (array[fast+1] == ' ' || fast == array.length-1)){
					  reverseletters(array, slow, fast);
				  }
			  }
		  }
		  
		  private void swap(char [] array, int a, int b){
			  char temp = array[a];
			  array[a] = array[b];
			  array[b] = temp;
		  }
	}