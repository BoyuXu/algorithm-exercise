package Treetraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> preOrder(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if(root == null){
			return result;
		}
		Deque <TreeNode> stack = new LinkedList<TreeNode>();
		stack.offerFirst(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.poll();
			result.add(cur.key);
			if(cur.right != null) {
				stack.offerFirst(cur.right);
			}
			if(cur.left != null){
				stack.offerFirst(cur.left);
			}
		}
		return result;
	}
	
	public static void main (String [] args){
		Solution s = new Solution();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		System.out.println(s.preOrder(n1));
	}
}
