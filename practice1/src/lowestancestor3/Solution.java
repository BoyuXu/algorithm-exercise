package lowestancestor3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	  public TreeNode lowestCommonAncestor(TreeNode root, List<TreeNode> nodes) {
	    // Write your solution here.
		// list convert to set
	    Set <TreeNode> set = new HashSet<TreeNode>(nodes);
	    return helper(root, set);
	  }
	  
	  private TreeNode helper(TreeNode root,Set<TreeNode> set){
		  if(root == null || set.contains(root)){
			  return root;
		  }
		  TreeNode left = helper(root.left,set);
		  TreeNode right = helper(root.right,set);
		  if(left != null && right != null){
			  return root;
		  }
		  else {
			  return left != null? left : right;
		  }
	  }
	  
	  public static void main (String [] args){
		  Solution s = new Solution();
		  TreeNode T1 = new TreeNode(1);
		  TreeNode T2 = new TreeNode(2);
		  TreeNode T3 = new TreeNode(3);
		  TreeNode T4 = new TreeNode(4);
		  TreeNode T5 = new TreeNode(5);
		  T1.left = T2;
		  T1.right = T3;
		  T2.left = T4;
		  T2.right = T5;
		  Set<TreeNode> set = new HashSet<>();
		  set.add(T5);
		  set.add(T4);
		  System.out.println(s.helper(T1, set));
	  }
}

