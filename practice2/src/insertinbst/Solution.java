package insertinbst;

public class Solution {
	  public TreeNode insert(TreeNode root, int key) {
	    // Write your solution here.
	   if(root == null){
		  TreeNode newRoot = new TreeNode(key);
		  return newRoot;
	   }
	   if(root.key < key){
		   root.right = insert(root.right, key);
	   }
	   else if(root.key > key){
		   root.left = insert(root.right,key);
	   }
	   return root;
	  }
}

