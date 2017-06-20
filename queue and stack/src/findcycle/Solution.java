package findcycle;

public class Solution {
	public boolean hasCycle (ListNode head) {
	    // write your solution here
	    if (head == null||head.next == null){
	    	return false;
	     }
	    ListNode slow = head;
	    ListNode fast = head;
	    while(fast!=null && fast.next!=null){
	    	slow = slow.next;
	    	fast = fast.next.next;
	    if(fast == slow){
	    	return true;}
	    }
	    return false;
	  }
}
// if there exists a circle, at one time, slow will equal to fast.