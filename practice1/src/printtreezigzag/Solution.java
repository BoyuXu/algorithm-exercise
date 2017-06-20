package printtreezigzag;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	  public List<Integer> zigZag(TreeNode root) {
	    // Write your solution here.
		  if (root == null){
			  return new LinkedList<Integer>();
		  }
		  List <Integer> result = new LinkedList<Integer>();
		  Deque <TreeNode> deque = new LinkedList<TreeNode>(); 
		  deque.offerFirst(root);
		  int layer = 0;
		  while(!deque.isEmpty()){
			  int size = deque.size();
			  for(int i = 0;i < size;i++){
			    //even level
				  if(layer == 0){
					  TreeNode cur = deque.pollLast();
					  result.add(cur.key);
					  if(cur.right != null){
						  deque.offerFirst(cur.right);
					  }
					  if(cur.left != null){
						  deque.offerFirst(cur.left);
					  }
				  }
				  //odd level
				  else{
					  TreeNode cur = deque.pollFirst();
					  result.add(cur.key);
					  if(cur.left != null){
						  deque.offerLast(cur.left);
					  }
					  if(cur.right != null){
						  deque.offerLast(cur.right);
					  }
				  }
			  }
			  layer = 1 - layer;
		  }
		  return result;
	   }
}