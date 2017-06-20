package stack;

public class stack {
	private ListNode head;
	public stack(){
		head = null;
	}
	
	public Integer pop(){
		if(head == null){
			return null;
		}
		ListNode prev = head;
		head = head.next;
		prev.next = null;
		return prev.value;
	}
	
	public void push(Integer ele){
		ListNode node = new ListNode(ele);
		node.next = head;
		head = node;
	}
	
	public Integer peek(){
		if(head == null){
			return null;
		}
		return head.value;
	}
	
	
}
