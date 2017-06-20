package largestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public int longest(String input) {
	    // Write your solution here.
		  Set<Character> distinct = new HashSet<Character>();
		  int slow = 0;
		  int fast = 0;
		  int longest = 0;
		  while(fast < input.length()){
			  if(distinct.contains(input.charAt(fast))){
				  // if there exists, delete it!
				  distinct.remove(input.charAt(fast));
				  longest = Math.max(fast - slow, longest);
				  slow = fast;
				  fast++;
			  }
			  else{
				  distinct.add(input.charAt(fast));
				  fast++;
				  }
		  }
		  longest = Math.max(fast - slow, longest);
		  return longest;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(s.longest("aaaa"));
	  }
}
