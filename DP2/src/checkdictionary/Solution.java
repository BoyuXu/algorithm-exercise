package checkdictionary;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public boolean canBreak(String input, String[] dict) {
	    // Write your solution here.
		  Set<String> dictset = toset(dict);
		  boolean [] indic = new boolean[input.length()+1];
	  	  indic[0] = true;
		  for (int i = 1; i < indic.length; i++){
		    for(int j = 0; j < i; j++) {
		      if(dictset.contains(input.substring(j,i))) {
		          if(indic[j] == true) {
		           indic[i] = true;
		          }
		      }
		    }
		  }
		  return indic[indic.length - 1];
	  }
	  private Set<String> toset(String [] dict) {
		  Set<String> set = new HashSet<>();
		  for(String c : dict) {
		    set.add(c);
		  }
		return set;
	  }
	  public static void main (String [] args) {
		  Solution s = new Solution();
		  String input = "bobrob";
		  String [] dic = {"bob","rob"};
		  System.out.println(s.canBreak(input, dic));
	  }
}
