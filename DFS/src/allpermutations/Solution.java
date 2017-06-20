package allpermutations;

import java.util.List;

import java.util.ArrayList;

public class Solution {
	  public List<String> permutations(String set) {
		    // Write your solution here.
		    List<String> result = new ArrayList<String>();
		    if(set == null){
		    	return result;
		    }
		    char [] array = set.toCharArray();
		    helper(array, 0 , result);
		    return result;
	  }
      private void helper(char[] array, int index, List<String> result){
    	    // termination
    	  if(index == array.length){
    		  result.add(new String(array));
    		  return;
    	  }
    	  for(int i =index; i<array.length; i++){
    		  swap(array, i, index);
    		  helper(array, index+1, result);
    		  swap(array, i, index);
    	  }
      }
      private void swap(char[] array, int a, int b){
    	  char temp = array[a];
    	  array[a] = array[b];
    	  array[b] = temp;
      }	  
      
      public static void main(String []args){
      	Solution s = new Solution();
      	List <String> a =s.permutations("abc");
      	System.out.println(a);
      }
}