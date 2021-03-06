package checkbinarytreeifiscompelete;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	  public boolean isCompleted(TreeNode root) {
		    // Write your solution here.
		  if(root == null){
			  return true;
		  }
		  Queue <TreeNode> queue = new LinkedList <TreeNode>();
		  queue.offer(root);
		  boolean flag = false;
		  while(queue.isEmpty()){
			  TreeNode cur = queue.poll();
			  if(cur.left == null){
				  flag = true;
			  }
			  //flag已经被设定，但是还有(相当于判断层数！)   ???
			  else if(flag){
				  return false;
			  }
			  else{
				  queue.offer(cur.left);
			  }
			  if(cur.right == null){
				  flag = true;
			  }
			  else if(flag){
				  return false;
			  }
			  else{
				  queue.offer(cur.right);
			  }
		  }
		  return flag;
		  }
}
