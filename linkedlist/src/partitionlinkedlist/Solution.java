package partitionlinkedlist;

public class Solution {
	  public ListNode partition(ListNode head, int target) {
	    // write your solution here
		  ListNode small = new ListNode(0);
		  ListNode large = new ListNode(0);
		  ListNode cursmall = small;
		  ListNode curlarge = large;
		  while(head != null){
			  if(head.value < target){
				  small.next = head;
				  small = small.next;
			  }
			  else{
				  large.next = head;
				  large = large.next;
			  }
			  head = head.next;
		  }
		  small.next = curlarge.next;
		  //尾部连接null
		  large.next = null;
		  return cursmall.next;
	  }
}