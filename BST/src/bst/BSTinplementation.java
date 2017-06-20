package bst;

public class BSTinplementation {
	public TreeNode search(TreeNode root, TreeNode target){
		if(root == null){
			return null;
		}
		if(target == root){
			return root;
		}
		if(target.key < root.key){
			return search(root.left, target);
		}
		else if(target.key > root.key){
			return search(root.right, target);
		}
		return null;
	}
	
	public TreeNode search2(TreeNode root, int key){
		while(root != null){
			if (key < root.key){
				root = root.left;
			}else if (key > root.key){
				root = root.right;
			}
			else{
				return root;
			}
		}
		return null;
	}
	
	public TreeNode insert(TreeNode root, int key){
		if(root == null){
			return new TreeNode(key);
		}
		if(root.key < key){
			root.right = insert(root.right, key);
		}else if (root.key > key){
			root.left = insert(root.left, key);
		}
		return root;
	}
	
	public TreeNode insert2(TreeNode root, int target){
		TreeNode newNode = new TreeNode(target);
		TreeNode current = root;
		while(current.key != target){
			if (current.key > target){
				if (current.left != null){
					current = current.left;
				}else{
					current.left = newNode;
					break;
				}
			}else{
				if (current.right != null){
					current = current.right;
				}else{
					current.right = newNode;
					break;
				}
			}
		}
		return root;
	}
	
	public TreeNode delete(TreeNode root, int target){
		if(root == null) {
			return null;
		}
		if(root.key > target) {
			root.left = delete(root.left, target);
			return root;
		}
		else if(root.key < target) {
			root.right = delete(root.right, target);
			return root;
		}
		//case 1 and 2;
		if (root.right == null) {
			return root.left;
		} else if(root.left == null) {
			return root.right;
		}
		if(root.right.left == null){
			root.right.left = root.left;
			return root.right;
		}
		TreeNode smallest = deleteSmallest(root.right);
		smallest.left = root.left;
		smallest.right = root.right;
		return smallest;
	}
		private TreeNode deleteSmallest(TreeNode cur) {
			TreeNode pre = cur;
			cur = cur.left;
			while(cur.left != null){
				pre = cur;
				cur = cur.left;
			}
			pre.left = pre.left.right;
			return cur;
		}
}
