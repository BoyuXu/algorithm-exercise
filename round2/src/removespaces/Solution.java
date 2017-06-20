package removespaces;

public class Solution {
	  public String removeSpaces(String input) {
		    // Write your solution here.
		  if(input.isEmpty()){
			  return input;
		  }
		  char [] array = input.toCharArray();
		  int slow = 0;
		  //head and duplicate
		  for(int fast = 0; fast < input.length(); fast++){
			  if(array[fast] == ' ' && (fast == 0 || array[fast-1] == ' ')){
				  continue;
			  }
			  array[slow ++] = array[fast];
		  }
		  //tail
		  if(slow > 0 && array[slow - 1] == ' '){
			  return new String(array, 0 , slow - 1);
		  }
		  return new String(array, 0 , slow);
	  }
}
