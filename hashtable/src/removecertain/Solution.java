package removecertain;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public String remove(String input, String t) {
		    // Write your solution here.
		  char [] array = input.toCharArray();
		  Set <Character> set = aim(t);
		  int slow = 0;
		  for(int fast = 0; fast < array.length ; fast++){
			  if (!set.contains(array[fast])){
				  array[slow] = array[fast];
			  }
		  }
		  return new String (array, 0 ,slow);
		  }
	  //convert t into hashtable, so it is easier to determine if t.
	  private Set<Character> aim (String t){
		  Set<Character> set = new HashSet<Character>();
		  for(int i = 0; i < t.length(); i++){
			  set.add(t.charAt(i));
		  }
	      return set; 
	  }
}
