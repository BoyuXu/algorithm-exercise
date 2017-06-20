package Queue;

public class Queue {
	public ListNode head;
	public ListNode tail;
	public Queue(){
		head = null;
		tail = null;
	}
	//poll at head
	public Integer poll(ListNode head){
		if(head == null){
			return null;
		}
		else{
		ListNode node = head;
		head = head.next;
			if(head == null){
				tail = null;
			}
		node.next = null;
		return node.value;
		}
	}
	
	//offer at tail
	public void offer(Integer ele){
		if(head == null){
			ListNode newNode = new ListNode(ele);
			head = newNode;
			tail = newNode;
		}
			tail.next = new ListNode(ele);
			tail = tail.next;
	}
	
	//peek
	public Integer peek(ListNode head){
		if(head == null){
			return null;
		}
		return head.value;
	}
}
