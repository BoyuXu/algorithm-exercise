package allsubsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<String> subSets(String set) {
		  List<String> result = new ArrayList<String>();
		  if(set == null){
			  return result;
		  }
		  char [] arrayset = set.toCharArray();
		  StringBuilder sb = new StringBuilder();
		  helper(arrayset, sb, result, 0);
		  return result;
	  }
	  private void helper(char [] arrayset, StringBuilder sb, List<String> result, int index){
		  if(index == arrayset.length){
			  result.add(sb.toString());
			  return;
		  }
		  helper(arrayset, sb , result, index + 1);
		  helper(arrayset, sb.append(arrayset[index]),result,index + 1);
		  sb.deleteCharAt(sb.length() - 1);
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(s.subSets("abc"));
	  }
}
