package dummynode;

public class dummynodeinsert {
	public ListNode insert(ListNode head,int value){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode newnode = new ListNode(value);
		ListNode cur = dummy.next;
		ListNode prev = dummy;
		while(cur != null || cur.value < value){
			prev = cur;
			cur = cur.next;
		}
		prev.next = newnode;
		newnode.next = cur;
		return head;
	}
}
