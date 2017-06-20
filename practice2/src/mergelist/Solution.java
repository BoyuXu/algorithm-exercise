package mergelist;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
	  public ListNode merge(List<ListNode> listOfLists) {
	    // Write your solution here/.
		  PriorityQueue<ListNode> minheap = new PriorityQueue<ListNode>(11,new MyComparator());
		  ListNode dummy = new ListNode(0);
		  ListNode cur = dummy;
		  for(ListNode node : listOfLists){
			  if(node != null){
				  minheap.offer(node);
			  }
		  }
		  while(!minheap.isEmpty()){
			  cur.next = minheap.poll();
			  if(cur.next.next != null){
				  minheap.offer(cur.next.next);
			  }
			  cur = cur.next;
		  }
		  return dummy.next;
	  }
	  
	  static class MyComparator implements Comparator<ListNode>{
		  @Override
		  public int compare(ListNode o1, ListNode o2){
			  if(o1.value == o2.value){
				  return 0;
			  }
			  return o1.value < o2.value? -1 : 1;
		  }
	  }
}
