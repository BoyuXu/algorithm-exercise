package cutwood;

public class Solution {
	  public int minCost(int[] cuts, int length) {
	    // Write your solution here.
		  int [] helper = new int[cuts.length + 2];
		  for(int i = 0; i < cuts.length; i++){
			  helper[i+1] = cuts[i];
		  }
		  helper[helper.length - 1] = length;
		  int [][] minCost = new int [helper.length][helper.length];
		  for(int i = 1; i < helper.length; i++){
			  for (int j = i - 1; j >= 0; j--){
				 if(i == j + 1){
					 minCost[j][i] = 0;
				 }
				 else{
					 minCost[j][i] = Integer.MAX_VALUE;
					 for(int k = j; k < i; k++){
						 minCost[j][i] = Math.min(minCost[j][i], minCost[j][k] + minCost[k][i]);
					 }
					 minCost[j][i] = helper[i] - helper[j] + minCost[j][i];
				 }
			  }
		  }
		  return minCost[0][helper.length - 1];
	  }
}