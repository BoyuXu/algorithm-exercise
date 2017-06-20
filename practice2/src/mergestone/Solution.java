package mergestone;

public class Solution {
	  public int minCost(int[] stones) {
	    // Write your solution here.
		 int length = stones.length;
		 int minCost[][] = new int [length][length];
		 int betweensum [][] = new int [length][length];
		 for(int i = 0; i < length; i++){
			 for (int j = i; j >= 0 ;j--){
				 if(i == j){
					 betweensum[j][i] = stones[i];
					 minCost[j][i] = 0;
				 }
				 else{
					 betweensum[j][i] = betweensum[j][i - 1] + stones[j];
					 minCost[j][i] = Integer.MAX_VALUE;
					 for(int k = j; k < i; k++){
						 minCost[j][i] = Math.min(minCost[j][i], betweensum[i][j] + minCost[j][k] + minCost[k+1][i]);
					 }
				 }
			 }
		 }
		 return minCost[0][length - 1];
	  }
}
