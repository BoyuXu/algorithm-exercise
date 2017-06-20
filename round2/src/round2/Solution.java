package round2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	  public int[] kSmallest(int[] array, int k) {
	    // Write your solution here
		  if(array.length == 0 || k == 0){
			  return new int[0];
		  }
		  PriorityQueue <Integer> maxheap = new PriorityQueue<Integer>(k, new Comparator<Integer>(){ 
			  @Override
			  public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				  if(o1.equals(o2)){
					  return 0;
				  }
				  return o1 > o2 ? -1 : 1;
			}
		  });
		  // offer k elements
		  for(int i = 0; i < array.length; i++){
			  if(i < k){
				  maxheap.offer(array[i]);
			  }
			  else if(array[i] < maxheap.peek()){
				 maxheap.poll();
				 maxheap.offer(array[i]);
			  }
		  }
		  int [] a = new int [k];
		  for(int i = k - 1; i >= 0 ; i--){
			  a[i] = maxheap.poll();
		  }
		  return a;
	  }
}