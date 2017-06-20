package issymmetric;

public class Solution {
	  public boolean isSymmetric(TreeNode root) {
	    // Write your solution here.
	    if(root==null){
	    	return true;
	    }
	   return decide(root.left,root.right);
	  }
	   public boolean decide(TreeNode b,TreeNode a){
		   //null condition
		   if(a == null && b == null){
			   return true;
		   }
		   else if(a == null || b==null){
			   return false;
		   }
		   else if(a.key!=b.key){
			   return false;
		   }
	      return decide(b.left,a.right) && decide(a.left, b.right);
	   }
  }

