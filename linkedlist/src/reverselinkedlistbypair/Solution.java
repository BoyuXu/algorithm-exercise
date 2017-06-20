package reverselinkedlistbypair;

public class Solution {
	public ListNode reverse(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode newHead = head.next;
		ListNode nextNode = reverse(newHead.next);
		newHead.next = head;
		head.next = nextNode;
		return newHead;
	}
}
