package randomcopylinkedlist;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	  public RandomListNode copy(RandomListNode head) {
	    // Write your solution here.
		  if(head == null){
			  return null;
		  }
		  RandomListNode dummy = new RandomListNode(0);
		  RandomListNode cur = dummy;
		  Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		  // if needs to copy?
		  while(head != null){
			  if(!map.containsKey(head)){
				  map.put(head, new RandomListNode(head.value));
			  }
			  cur.next = map.get(head);
			  if(head.random != null){
				  if(!map.containsKey(head.random)){
					  map.put(head.random, new RandomListNode(head.random.value));
				  }
					  cur.next.random = map.get(head.random);
				  }
			  head = head.next;
			  cur = cur.next;
		  }
		  return dummy.next;
	  }
}
