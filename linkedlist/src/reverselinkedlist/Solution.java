package reverselinkedlist;

public class Solution {
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
	public static void main (String []args){
		Solution s = new Solution();
		ListNode s1 = new ListNode(1);
		ListNode s2 = new ListNode(2);
		ListNode s3 = new ListNode(3);
		s1.next = s2;
		s2.next = s3;
		System.out.println(s.reverse(s1));
	}
}
