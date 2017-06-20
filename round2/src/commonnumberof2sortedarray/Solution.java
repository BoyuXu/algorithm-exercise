package commonnumberof2sortedarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	  public List<Integer> common(List<Integer> A, List<Integer> B) {
		  List<Integer> common = new ArrayList<>();
		  Map<Integer, Integer> a = new HashMap<>();
		  Map<Integer, Integer> b = new HashMap<>();
		  for(int num : A){
			  if(a.get(num) == null){
				  a.put(num, 1);
			  }
			  else{
				  a.put(num, a.get(num) + 1);
			  }
		  }
		  for(int num : B){
			  if(b.get(num) == null){
				  b.put(num, 1);
			  }
			  else{
				  b.put(num, b.get(num) + 1);
			  }
		  }
		  for(Map.Entry<Integer, Integer> entry : a.entrySet()){
			  if(b.get(entry.getKey()) != null){
				  Integer smallest = Math.min(entry.getValue(), b.get(entry.getKey()));
				  for (int i = 0; i < smallest; i ++){
					  common.add(entry.getKey());
				  }
			  }
		  }
		  return common;
	  }
	  
	  public static void main (String [] args){
		  Solution s = new Solution();
		  List<Integer> a = new ArrayList<>();
		  a.add(0);
		  a.add(0);
		  a.add(1);
		  List<Integer> b = new ArrayList<>();
		  b.add(0);
		  b.add(1);
		  b.add(1);
		  System.out.println(s.common(a, b));
	  }
}
