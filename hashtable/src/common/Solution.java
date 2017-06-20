package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	  public List<Integer> common (List<Integer> A, List<Integer> B) {
		    // Write your solution here.
		    List<Integer> common = new ArrayList <Integer>();
		    HashMap <Integer,Integer> a = new HashMap<Integer, Integer>();
		    for (int num : A){
		    	Integer s = a.get(num);
		    	if(s==null){
		    		a.put(num,1);
		    	}
		    	else{
		    		a.put(num, s+1);
		    	}
		    }
		    HashMap <Integer, Integer> b = new HashMap <Integer, Integer>();
		    for(int num :B){
		    	Integer s = b.get(num);
		    	if(s == null){
		    		b.put(num, 1);
		    	}
		        else{
		        	b.put(num, s+1);
		        }
		    	}
		    for(Map.Entry<Integer, Integer> entry : a.entrySet()){
		    	//取出在b中的key，看对应什么value
		    	Integer s = b.get(entry.getKey());
		    	//找两者中的最小做循环输出
		    	if(s != null){
		    	Integer smallest = Math.min (s,entry.getValue());
		    	for(int i = 0 ; i < smallest; i++){
		    		common.add(entry.getKey());
		    	}
		    	}
		    }
		    return common;
		    }
}