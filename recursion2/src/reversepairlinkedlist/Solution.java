package reversepairlinkedlist;

public class Solution {
	  public ListNode reverseInPairs(ListNode head) {
	    // Write your solution here.
		if(head == null || head.next == null){
			return head;
		}
		//换头成为head.next最终成为头部
		ListNode newhead = head.next;
		head.next = reverseInPairs(head.next.next);
	    newhead.next = head; 
		return newhead;
	  }
	}
