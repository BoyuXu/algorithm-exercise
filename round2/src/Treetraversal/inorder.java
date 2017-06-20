package Treetraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class inorder {
	 public List<Integer> inOrder(TreeNode root) {
		 List<Integer> result = new ArrayList<>();
		 Deque<TreeNode> stack = new LinkedList<>();
		 TreeNode cur = root;
		 stack.offerFirst(cur);
		 while (cur != null || !stack.isEmpty()) {
			 if (cur != null) {
				 stack.offerFirst(cur);
				 cur = cur.left;
			 }
			 else {
			 cur = stack.poll();
			 result.add(cur.key);
			 cur = cur.right;
			 }
		 }
		 return result;
	 }
	 
	 public static void main (String [] args){
		 inorder s = new inorder();
		 TreeNode n1 = new TreeNode(1);
		 TreeNode n2 = new TreeNode(2);
		 TreeNode n3 = new TreeNode(3);
		 TreeNode n4 = new TreeNode(4);
		 n1.left = n2;
		 n1.right = n3;
		 n2.left = n4;
		 System.out.println(s.inOrder(n1));
	 }
}
