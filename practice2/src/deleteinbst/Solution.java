package deleteinbst;

public class Solution {
	  public TreeNode delete(TreeNode root, int key) {
	    // Write your solution here.
		  if(root == null){
		   return null;
		  }
		  if(root.key < key && root.right != null){
		   root.right = delete(root.right, key);
		   return root;
		  }
		  else if(root.key > key && root.left != null){
		   root.left = delete(root.left, key);
		   return root;
		  } 
		  if(root.key == key){
			  //case 1: root is leaf node;
			  if(root.right == null && root.left == null){
				  return null;
			  }
			  //case 2: root has one child
			  else if(root.right == null || root.left == null){
				  return root.left == null? root.right: root.left;
			  }
			  //case 3: root has both children
			  else{
				  TreeNode smallest = findsmallest(root.right);
				  root.key = smallest.key;
				  root.right = delete(root.right,smallest.key);
			  }
		  }
		  return root;
	  }
	  private TreeNode findsmallest(TreeNode node){
		  while(node.left != null){
			  node = node.left;
		  }
		  return node;
	  }
}