package reconstructwithpostorder;

public class Solution {
	  public TreeNode reconstruct(int[] post) {
	    // Write your solution here.
		  int [] index = new int [] {post.length - 1};
		  return helper(post, index, Integer.MIN_VALUE);
	  }
	  private TreeNode helper(int [] post, int[] index , int min){
		  if(index[0] < 0 || post[index[0]] <= min){
			  return null;
		  }
		  TreeNode root = new TreeNode(post[index[0]--]);
		  root.right = helper(post, index, root.key);
		  root.left = helper(post, index, min);
		  return root;
	  }
	  
	  public static void main (String[]args){
		  Solution s = new Solution();
		  /*
		  TreeNode s1 = new TreeNode(4);
		  TreeNode s2 = new TreeNode(1);
		  TreeNode s3 = new TreeNode(6);
		  TreeNode s4 = new TreeNode(0);
		  TreeNode s5 = new TreeNode(3);
		  TreeNode s6 = new TreeNode(5);
		  TreeNode s7 = new TreeNode(7);
		  s1.left = s2;
		  s1.right = s3;
		  s2.left = s4;
		  s2.right = s5;
		  s3.left = s6;
		  s3.right = s7;
		  */
		  int [] post = {0,3,1,5,7,6,4};
		  System.out.println(s.reconstruct(post));
	  }
}