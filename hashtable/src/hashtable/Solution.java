package hashtable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {
	  public String[] topKFrequent(String[] combo, int k) {
	    // Write your solution here.
			  if(combo.length == 0){
				  return new String[0];
			  }
			  //record each string and freq
			  Map <String, Integer> freqmap = getfreqmap(combo);
			  //priorityqueue
			  PriorityQueue<Map.Entry<String, Integer>> minheap = new PriorityQueue<> (k, new Comparator<Map.Entry<String, Integer>>(){
				 @Override
					public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
						return a.getValue().compareTo(b.getValue()); 
					}
				   });
			  //find bigger one
			  for(Map.Entry<String, Integer>Entry : freqmap.entrySet()){
				  if(minheap.size() < k){
					  minheap.offer(Entry);
				  }
				  else if(Entry.getValue() > minheap.peek().getValue()){
					  minheap.poll();
					  minheap.add(Entry);
				  }
			  }
			  return freqarray(minheap);
			  }
		  //hashmap construct
		  private Map<String, Integer> getfreqmap(String [] combo){
			  Map<String, Integer> hello = new HashMap();
			  //计数方法
			  for (String s : combo){
				  Integer a = hello.get(s);
				  if(a == null){
					  hello.put(s, 1);
				  }
				  else{
					  hello.put(s, a+1);
				  }
			  }
			  return hello;
		  }
		  //output
		  private String [] freqarray(PriorityQueue<Map.Entry<String, Integer>> minheap){
			  String [] result = new String[minheap.size()];
			  for(int i = minheap.size()-1; i >= 0 ; i--){
				  result[i] = minheap.poll().getKey();
			  }
			  return result;
		  }  
	}