package topKfrequencywords;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Map;

public class Solution2 {
	public String[] topKFrequent(String [] comb, int k) {
		if (comb.length == 0) {
			return new String [0];
		}
		Map<String, Integer> freq = getfreq(comb);
		PriorityQueue<Map.Entry<String,Integer>> minheap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>(){
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
				return a.getValue().compareTo(b.getValue());
			}
		});
		for(Map.Entry<String, Integer> entry : freq.entrySet()) {
			if (minheap.size() < k) {
				minheap.offer(entry);
			}else if(minheap.peek().getValue() < entry.getValue()) {
				minheap.poll();
				minheap.offer(entry);
			}
		}
		String [] output = new String [minheap.size()];
		for (int i = minheap.size() - 1; i >= 0; i--) {
			output[i] = minheap.poll().getKey();
		}
		return output;
	}
	private Map<String, Integer> getfreq(String [] comb){
		Map<String, Integer> freq = new HashMap<>();
		for (int i = 0; i < comb.length; i ++) {
			if(freq.get(comb[i]) == null){
				freq.put(comb[i], 1);
			}else {
				freq.put(comb[i], freq.get(comb[i]) + 1);
			}
		}
		return freq;
	} 
}
