package searchinbst;

public class Solution {
	public TreeNode search(TreeNode root, int key){
		if(root == null){
			return null;
		}
		if(root.key < key && root.right != null){
			return search(root.right, key);
		}
		else if(root.key > key && root.left != null){
			return search(root.left, key);
		}
		else if(root.key == key){
			return root;
		}
		else{
			return null;
		}
	}
}
