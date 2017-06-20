package twosums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	    public int[] twoSum(int[] nums, int target) {
	       int [] result = new int [2];
	       if(nums == null ||  nums.length == 0){
	           return result;
	       } 
	       Map<Integer, Integer> map = new HashMap<>();
	       for(int i = 0; i < nums.length; i++){
	           map.put(nums[i],i);
	       }
	       for(int i = 0; i < nums.length; i++){
	           if(map.containsKey(target - nums[i])){
	               result[0] = i;
	               result[1] = map.get(i);
	           }
	       }
	       return result;
	    }
	    public static void main(String [] args){
	    	Solution s = new Solution();
	    	int [] array = {3,2,4};
	    	System.out.print(Arrays.toString(s.twoSum(array, 6)));
	    }
}
