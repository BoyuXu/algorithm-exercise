package ListNode;

public class ListNode {
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.next = null;
		this.value = value;
	}
	public ListNode(ListNode another){
		this.value = another.value;
		this.next = another.next;
	}
	//length
	int length(ListNode head){
		int length = 0;
		while(head != null){
			length++;
			head = head.next;
		}
	return length;
	}
	//get(index)
	ListNode get(int index, ListNode head){
		while(index > 0 && head != null){
			head = head.next;
			index--;
		}
		return head;
	}
	//appendhead
	ListNode appendhead(ListNode head, int value){
		ListNode newhead = new ListNode(value);
		newhead.next = head;
		return newhead;
	}
	//appendtail
	ListNode appendtail(ListNode head, int value){
		if(head == null){
			return new ListNode(value);
		}
		//原来的head不能改变
		ListNode prev = head;
		while(prev.next != null){
			prev = prev.next;
		}
			prev.next = new ListNode(value);
			return head;
	}
}
