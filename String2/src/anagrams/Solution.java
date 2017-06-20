package anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	  List<Integer> allAnagrams(String s, String l) {
	    // Write your solution here.
		  List<Integer> result = new ArrayList<>();
		  if(l.length() == 0){
			  return result;
		  }
		  if(s.length() > l.length()){
			  return result;
		  }
		  Map<Character, Integer> map = buildMap(s);
		  int matches = 0;
		  for(int fast = 0; fast < l.length(); fast++){
			  char temp = l.charAt(fast);
			  Integer count = map.get(temp);
			  if(count != null){
				  map.put(temp, count - 1);
				  if(count == 1){
					  matches++;
				  }
			  }
			  //leftmost
			  if(fast >= s.length()){
				  temp = l.charAt(fast - s.length());
				  count = map.get(temp);
				  if(count != null){
					  map.put(temp, count + 1);
					  if(count == 0){
						  matches --;
					  }
				  }
			  }
			  //map.size!
			  if(matches == map.size()){
				  result.add(fast - s.length() + 1);
			  }
		  }
		  return result;
	  }
	  
	  private Map<Character, Integer> buildMap(String s){
		  Map<Character, Integer> map = new HashMap<>();
		  for(char a : s.toCharArray()){
			  if(map.get(a) == null){
				  map.put(a,1);
			  }else{
				  map.put(a, map.get(a)+1);
			  }
		  }
		  return map;
	  }
	  
	  public static void main (String [] args){
		  Solution s = new Solution();
		  String a = "baaaa";
		  String b = "aa";
		  System.out.println(s.allAnagrams(b, a));
	  } 
}
