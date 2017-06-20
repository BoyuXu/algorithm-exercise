package removecertaincharacter;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public String remove(String input, String t) {
		// Write your solution here.
		  int slow = 0;
		  char [] array = input.toCharArray();
		  Set <Character> set = aim(t);
		  for(int fast = 0; fast < input.length(); fast++){
			  if(!set.contains(array[fast])){
					  array[slow] = array[fast];
					  slow++;
				  }
		  }
		  return new String(array, 0 ,slow);
	  }
	  private Set<Character> aim(String t){
		  Set<Character> set = new HashSet<>();
		  for(int i = 0; i < t.length(); i++){
			  set.add(t.charAt(i));
		  }
		  return set;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(s.remove("abccddefffghhh","cf"));
	  }
}
