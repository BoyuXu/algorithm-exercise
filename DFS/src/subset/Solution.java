package subset;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<String> subSets(String set) {
		    // Write your solution here.
		  List<String> result = new ArrayList<String>();
		  if(set == null){
			  return result;
		  }
	      char[]arrayset = set.toCharArray();
	      //记录subset
	      StringBuilder sb = new StringBuilder();
	      helper(arrayset, sb, 0, result);
	      return result;
      }
	  //每层的含义代表选取/不选取此元素（a,b,c...）
	  private void helper(char[]set, StringBuilder sb, int index, List<String> result){
		  //termination: INDEX = string.length
		  if (index == set.length){
			  if (sb.length() == 2){
				  result.add(sb.toString());
			  }
			  return;
		  }
		  //not pick
		  helper(set, sb, index+1, result);
		  //pick
		  helper(set, sb.append(set[index]), index+1,result);
		  //??????
		  sb.deleteCharAt(sb.length()-1);
		  }
		  
	  }
