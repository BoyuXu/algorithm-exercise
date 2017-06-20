package stackwithmin;

import java.util.LinkedList;

public class Solution {
	LinkedList<Integer> stack1;
    //insert into in stack
    LinkedList<Integer> stack2;
    //remove from out stack
	  public Solution(){
		  stack1 = new LinkedList<Integer>();
		  stack2 = new LinkedList<Integer>();
	  }	  
	  
	  public int pop() {
	    if(stack1.isEmpty()){
	    	return -1;
	    }
	    int a = stack1.pollFirst();
	    if(stack2.peekFirst()==a){
	        stack2.pollFirst();	
	    }//if the element is in stack2, it needs to be polled as well
	    return a;
	  }
	  
	  public void push(int value) {
	    stack1.offerFirst(value);
	    if(stack2.isEmpty()||stack2.peekFirst()>=value){
	    	stack2.offerFirst(value);
	    }
	  }
	  
	  public int top() {
		  if(stack1.isEmpty()){
			  return -1;
		  }
	    return stack1.peekFirst();
	  }
	  
	  public int min() {
	    if(stack2.isEmpty()){
	    return -1;
	    }
	    return stack2.peekFirst();
	  }
}
