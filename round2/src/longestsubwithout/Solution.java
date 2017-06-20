package longestsubwithout;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public int longest(String input) {
	    // Write your solution here.
		  Set<Character> set = new HashSet<>();
		  int slow = 0;
		  int fast = 0;
		  int longest = 0;
		  while(fast < input.length()){
			  if(set.contains(input.charAt(fast))){
				  set.remove(input.charAt(slow ++));
			  }
			  else{
				  set.add(input.charAt(fast++));
				  longest = Math.max(longest, fast - slow);
			  }
		  }
		  return longest;
	  }
	  public static void main(String [] args){
		  Solution s = new Solution();
		  String a = "abcbcdef";
		  System.out.println(s.longest(a));
	  }
}
