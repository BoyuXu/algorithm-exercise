package queue;

import java.util.LinkedList;

public class Solution {
	      LinkedList<Integer> in;
	      //insert into in stack
	      LinkedList<Integer> out;
	      //remove from out stack
		  public Solution(){
			  in = new LinkedList<Integer>();
			  out = new LinkedList<Integer>();
		  }
		  
		  public Integer poll() {
			  move();
		      return out.isEmpty()? null:out.pollFirst();
		  }
		  
		  public void offer(int value) {
			  in.offerFirst(value);
		  }
		  
		  public Integer peek() {
			  move();
			  return out.isEmpty()? null:out.peekFirst();
		  }
		  
		  private void move(){
			  if(out.isEmpty()){
				  while(!in.isEmpty()){
					  out.offerFirst(in.pollFirst());
				  }
			  }
		  }
		  public int size() {
		      return in.size()+out.size();
		  }
		  
		  public boolean isEmpty() {
		      return in.size() == 0 && out.size() == 0;
		  }
}

