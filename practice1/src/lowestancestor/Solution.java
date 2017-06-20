package lowestancestor;

public class Solution {
	  public TreeNodeP lowestCommonAncestor(TreeNodeP one, TreeNodeP two) {
	    // Write your solution here.
	    //using the height
		  int a = length(one);
		  int b = length(two);
		  if(a > b){
			  return mergeNode(one, two, a - b);
		  }
		  else{
			  return mergeNode(two, one, b-a);
		  }
	  }
	  
	  private TreeNodeP mergeNode(TreeNodeP longer, TreeNodeP shorter, int diff){
		  while(diff > 0){
			  longer = longer.parent;
			  diff--;
		  }
		  //find common ancestor
		  while(shorter != longer){
			  shorter = shorter.parent;
			  longer = longer.parent;
		  }
		  return longer;
	  }
	  
	  private int length(TreeNodeP one){
		  int length = 0 ;
		  while(one != null){
			  one = one.parent;
			  length ++;
		  }
		  return length;
	  }
	}