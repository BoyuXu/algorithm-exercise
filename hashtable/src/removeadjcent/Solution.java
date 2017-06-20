package removeadjcent;

public class Solution {
	  public String deDup(String input) {
		    // Write your solution here.
		    if(input == null|| input.length() == 0){
		    	return null;
		    }
		    char [] array = input.toCharArray();
		    //char [] p = input.toCharArray();
		    int slow = 0;
		    //!!!array[fast]!=array[slow-1]
		    for(int fast = 0; fast < array.length; fast++){
		    	if (slow == 0 || array[slow - 1] != array[fast]){
		    		array[slow] = array[fast];
		    		slow++;
		    	}
		    }
		    return new String(array, 0 ,slow);
		  } 
}
