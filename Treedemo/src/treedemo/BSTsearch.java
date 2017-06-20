package treedemo;

public class BSTsearch {
	//search
	public treeNode search(treeNode root, int target){
		//root
		if(root == null || root.key == target){
			return root;
		}
		if(root.key > target){
			return search(root.left, target);
		}
		else{
			return search(root.right, target);
		}
	}
	
	//insert
	public treeNode insert(treeNode root, int key){
		if(root == null){
			treeNode newroot = new treeNode(key);
			return newroot;
		}
		if(key < root.key){
			root.left = insert(root.left, key);
		}
		else if(key > root.key){
			root.right = insert(root.right, key);
		}
		return root;
	}
	
	//delete: find the smallest right child or largest left child to replace it.
	
	public treeNode delete(treeNode root, int target){
		// case 1: node to be deleted have no child
		if(root == null){
			return root;
		}
		
		if(root.key > target){
			root.left = delete(root.left, target);
			return root;
		}
		else if(root.key < target){
			root.right = delete(root.right, target);
			return root;
		}
		//case 2 : node to be deleted have no left child
		if(root.left == null){
			return root.right;
		}
		//case 3: node to be deleted have no right child
		else if(root.right == null){
			return root.left;
		}
		//case 4: root.right has no left child
		if(root.right.left == null){
			root.right.left = root.left;
			return root.right;
		}
		//case 4.2: root.right has left child
		treeNode smallest = deletesmallest(root.right);
		smallest.left = root.left;
		smallest.right = root.right;
		return smallest;
	}
	
	private treeNode deletesmallest(treeNode cur){
		treeNode prev = cur;
		cur = cur.left;
		while(cur.left != null){
			prev = cur;
			cur = cur.left;
		}
		prev.left = prev.left.right;
		return cur;
	}
}
