package reverseLinkedList;

public class Solution {
  public ListNode reverse(ListNode head) {
    // write your solution here
	ListNode prev = null;
	while(head!=null){
		ListNode next = head.next;
		head.next = prev;
		prev = head;
		head = next;
	}
    return prev;
  }
}

