package twosumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<Integer>> allPairs(int[] array, int target) {
		// Write your solution here.
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    //Map<number,count>
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int num : array){
	        Integer count = map.get(num);
	    	if(num * 2 == target && count != null && count == 1){
	    		result.add(Arrays.asList(num,num));
	    	}
	    	//prevent from dup, so count == null condition
	    	if(map.containsKey(target - num) && count == null){
	    		result.add(Arrays.asList(target - num, num));
	    	}
	    	if(count == null){
	    		map.put(num, 1);
	    	}else{
	    		map.put(num, 1 + count);
	    	}
	    }
	    return result;
	}
}