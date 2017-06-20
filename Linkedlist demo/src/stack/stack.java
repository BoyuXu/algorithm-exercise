package stack;

public class stack {
	public ListNode head;
	public stack(){
		head = null;
	}
	
	//pop
	public Integer pop(ListNode head){
		if(head == null){
			return null;
		}
		ListNode prev = head;
		prev.next = null;
		head = head.next;
		return prev.value;
	}
	
	//peek
	public Integer peek(ListNode head){
		if(head == null){
			return null;
		}
		return head.value;
	} 
	
	//push
	public void push (Integer value){
		ListNode newnode = new ListNode(value);
		newnode.next = head;
		head = newnode;
	}
}
