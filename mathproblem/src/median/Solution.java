package median;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	  public Solution() {
	    // add new fields and complete the constructor if necessary.
		  largehalf = new PriorityQueue<Integer>();
		  smallhalf = new PriorityQueue<Integer>(11, Collections.reverseOrder());
	  }
	  private PriorityQueue<Integer> largehalf;
	  private PriorityQueue<Integer> smallhalf;
	  
	  public void read(int value) {
	    // write your implementation here.
		  if(smallhalf.isEmpty() || value <= smallhalf.peek()){
			  smallhalf.offer(value);
		  }
		  else{
			  largehalf.offer(value);
		  }
		  if(smallhalf.size() - largehalf.size() >= 2){
			  largehalf.offer(smallhalf.poll());
		  }
		  else if(largehalf.size() > smallhalf.size()){
			  smallhalf.offer(largehalf.poll());
		  }	  
	  }
	  
	  public Double median() {
	    // write your implementation here.
	    int size = largehalf.size() + smallhalf.size();
	    if(size == 0){
	      return null;
	    }
	    else if(size % 2 != 0){
	    	return (double) (smallhalf.peek());
	    }
	    else{
	    	return (smallhalf.peek() + largehalf.peek())/2.0;
	    }
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println();
	  }
}


