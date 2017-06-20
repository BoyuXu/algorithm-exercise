package allpermurtation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<String> permutations(String set) {
		  List<String> result = new ArrayList<>();
		  if(set == null){
			  return result;
		  }
		  char[] arrayset = set.toCharArray();
		  helper(arrayset, 0, result);
		  return result;
	  }
	  private void helper(char [] arrayset, int index, List<String> result){
		  if(index == arrayset.length){
			  result.add(new String(arrayset));
			  return;
		  }
		  for(int i = index; i < arrayset.length; i++){
			  swap(arrayset,i,index);
			  helper(arrayset, index+1, result);
			  swap(arrayset,i,index);
		  }
	  }
	  private void swap( char[] set, int i, int j){
		  char temp = set [i];
		  set[i] = set[j];
		  set[j] = temp;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(s.permutations("abc"));
	  }
}
