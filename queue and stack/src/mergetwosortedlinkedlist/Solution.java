package mergetwosortedlinkedlist;

public class Solution {
    public ListNode merge(ListNode one, ListNode two) {
		    // write your solution here
    	    ListNode dummy = new ListNode(0);
   
    	    ListNode cur = dummy;
    	    while(one != null && two != null){
    	    	if(one.value< two.value){
    	    		cur.next = one;
    	    		one = one.next;
    	    	}
    	    	else{
    	    		cur.next = two;
    	    		two = two.next;
    	    	}
    	    	cur = cur.next;
    	    }
    	    //important: there may be some elements in A and B left
    	    if(one != null){
    	    	cur.next = one;
    	    	one = one.next;
    	    }
    	    if(two != null){
    	    	cur.next = two;
    	    	two = two.next;
    	    }
  return cur;}
}
