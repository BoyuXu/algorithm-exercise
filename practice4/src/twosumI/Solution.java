package twosumI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<Integer>> allPairs(int[] array, int target) {
		// Write your solution here.
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    //key : number, value:list of all possible index;
	    Map<Integer, List<Integer>> map = new HashMap<>();
	    for (int i = 0; i < array.length; i++){
	    	List<Integer> list = map.get(target - array[i]);
	    	if(list != null){
	    		for(Integer m : list){
	    			result.add(Arrays.asList(m,i));
	    		}
	    	}
	    	if(!map.containsKey(array[i])){
	    		map.put(array[i], new ArrayList());
	    	}
	    	map.get(array[i]).add(i);
	    }
	    return result;
	  }		
}
