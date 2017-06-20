package middlenode;

public class Solution {
	public ListNode findmiddle (ListNode head){
		if(head == null){
           return null;
	}
		ListNode slow = head;
		ListNode Quick = head;
		while(Quick.next!=null && Quick.next.next!=null){
			Quick = Quick.next.next;
			slow = slow.next;
		}
	return slow;
	}
}
