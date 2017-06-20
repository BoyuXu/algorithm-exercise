package inordertraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> inorder(TreeNode root){
		List<Integer> inorder = new ArrayList<Integer>();
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		TreeNode cur = root;
		while(cur!= null||!stack.isEmpty()){
			if (cur!=null){
			    stack.offerFirst(cur);
			    cur = cur.left;
			}
		else{
			cur = stack.pollFirst();
			inorder.add(cur.key);
			cur = cur.right;
		}
	  }
	return inorder;
	}
}
