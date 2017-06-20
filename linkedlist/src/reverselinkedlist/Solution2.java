package reverselinkedlist;

public class Solution2 {
	public ListNode reverse(ListNode head){
		ListNode pre = null;
		while(head != null){
			ListNode cur = head.next;
			head.next = pre;
			pre = head;
			head = cur;
		}
		return pre;
	}
	public static void main (String []args){
		Solution2 s = new Solution2();
		ListNode s1 = new ListNode(1);
		ListNode s2 = new ListNode(2);
		ListNode s3 = new ListNode(3);
		s1.next = s2;
		s2.next = s3;
		System.out.println(s.reverse(s1));
	}
}
