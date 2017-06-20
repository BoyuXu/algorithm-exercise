package queue;

public class queue {
	ListNode head;
	ListNode tail;
	public queue(){
		head = tail = null;
	}
	
	public Integer poll(){
		if(head == null){
			return null;
		}
		ListNode node = head;
		head = head.next;
		if(head == null){
			tail = null;
		}
		node.next = null;
		return node.value;
	}
	
	public void offer(Integer ele){
		ListNode node = new ListNode(ele);
		if(head == null){
			head = node;
			tail = head;
		}
		else{
		tail.next = node;
		tail = tail.next;
		}
	}
	
	
}
