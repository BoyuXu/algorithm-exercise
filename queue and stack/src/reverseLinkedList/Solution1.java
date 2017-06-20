package reverseLinkedList;

public class Solution1 {
	public ListNode reverse(ListNode head) {
	 // write your solution here
		if(head == null || head.next == null){
			return head;
		}
		ListNode newhead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newhead;
	}
}
