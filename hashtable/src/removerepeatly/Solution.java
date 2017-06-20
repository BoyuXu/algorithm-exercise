package removerepeatly;

public class Solution {
	  public String deDup(String input) {
		    // Write your solution here.
		   //conner case
		  if(input == null || input.length() <= 1){
			  return input;
		  }
		  char [] array = input.toCharArray();
		  int slow = 0;
		  for (int fast = 1; fast < array.length; fast++){
			  // 如果是空，或者没有重复，那么就
			  if(slow == -1 || array[slow] != array[fast]){
				  array[++slow] = array[fast];
			  }
			  else{
				  slow--;
				  while(fast + 1 < array.length && array[fast] == array [fast+1]){
					  fast++;
				  }
			  }
		  }
		  return new String (array, 0 , slow+1);
		  }
		}

