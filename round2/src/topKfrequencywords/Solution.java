package topKfrequencywords;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
	  public String[] topKFrequent(String[] combo, int k) {
	    // Write your solution here.
		  if(combo.length == 0){
			  return new String[0];
		  }
		  Map<String, Integer> freqmap = getfreq(combo);
		  PriorityQueue<Map.Entry<String,Integer>> minheap = new PriorityQueue<>(k,new Comparator<Map.Entry<String, Integer>>() {
			  @Override
			  public int compare(Map.Entry<String, Integer> a,Map.Entry<String, Integer> b){
				  return a.getValue().compareTo(b.getValue());
			  }
		  });
		  for(Map.Entry<String, Integer> Entry : freqmap.entrySet()){
			  if(minheap.size() < k){
				  minheap.offer(Entry);
			  }
			  else if(Entry.getValue() > minheap.peek().getValue()){
				  minheap.poll();
				  minheap.offer(Entry);
			  }
		  }
		  return output(minheap);
	  }
	  private Map<String, Integer> getfreq(String[] input){
		  Map<String, Integer> map = new HashMap<>();
		  for(String s : input){
			  if(map.get(s) == null){
				  map.put(s, 1);
			  }
			  else{
				  map.put(s, map.get(s)+1);
			  }
		  }
		  return map;
	  }
	  
	  private String[] output(PriorityQueue<Map.Entry<String,Integer>> minheap){
		  String [] result = new String [minheap.size()];
		  for(int i = minheap.size() - 1; i >= 0; i--){
			 result[i] = minheap.poll().getKey();
		  }
		  return result;
	  }
	  
	  public static void main (String [] args){
		  Solution s = new Solution();
		  String [] input = {"a","a","b","c","d","d","d"};
		  System.out.println(Arrays.toString(s.topKFrequent(input, 2)));
	  }
}
