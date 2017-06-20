package allpermutation2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	  public List<String> permutations(String set) {
		    // Write your solution here.
		 List <String> result = new ArrayList <String>();
		 if(set == null){
			 return result;
		 }
		 char [] array = set.toCharArray();
		 permutation(array, 0 ,result);
		 return result;
		 }
	  
	  private void permutation(char[] array, int index , List<String> result){
		  if(index == array.length){
			  result.add(new String(array));
			  return;
		  }
		  //notice: use hashset to avoid the duplicate situation, just for this level
		  Set<Character> used = new HashSet<Character>();
		  for (int i=index; i<array.length;i++){
			  //判断used.add
			  if(used.add(array[i])){
				  swap(array, i, index);
				  permutation(array, index+1, result);
				  swap(array,index,i);
			  }
		  }
	  }
	  
	  private void swap(char[] array, int a, int b){
		  char temp = array[a];
		  array[a] = array[b];
		  array[b] = temp;
	  }
}
