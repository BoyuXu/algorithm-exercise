package reorderlinkedlist;

public class Solution {
	  public ListNode reorder(ListNode head) {
	    // Write your solution here.
		  if(head == null || head.next == null){
			  return head;
		  }
		  //1.find mid
		  ListNode mid = middleNode(head);
		  ListNode one = head;
		  ListNode two = mid.next;
		  mid.next = null;
		  //2.reverse second half
		  //3.merge 2 parts
		  return merge(one, reverse(two));
	  }
	  
	  private ListNode middleNode(ListNode head){
		  ListNode slow = head;
		  ListNode fast = head;
		  while(fast.next != null && fast.next.next != null){
			  slow = slow.next;
			  fast = fast.next.next;
		  }
		  return slow;
	  }
	  
	  private ListNode reverse(ListNode head){
		  if(head == null || head.next == null){
			  return head;
		  }
		  ListNode newNode = reverse(head.next);
		  head.next.next = head;
		  head.next = null;
		  return newNode;
	  }
	  
	  private ListNode merge(ListNode one, ListNode two){
		  ListNode dummy = new ListNode(0);
		  ListNode cur = dummy;
		  while(one != null && two != null){
			  cur.next = one;
			  one = one.next;
			  cur.next.next = two;
			  two = two.next;
			  cur = cur.next.next;
		  }
		  if(one != null){
			  cur.next = one;
		  }
		  else{
			  cur.next = two;
		  }
		  return dummy.next;
	  }
}

