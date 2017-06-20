package insertinsortedlinkedlist;

public class Solution {
	  public ListNode insert(ListNode head, int value) {
		    // write your solution here
		  ListNode s = new ListNode(value);
		  if(head == null||head.value>=value){
			  s.next = head;
			  return s;
		  }
		  ListNode pre = head;
		  while(pre.next!=null && pre.next.value<value){    //use "pre.next.value" in case lose head.
			  s.next = pre.next;
		  }
		    s.next = pre.next;
			  pre.next = s;
			  return head;  
		  }
	  }
