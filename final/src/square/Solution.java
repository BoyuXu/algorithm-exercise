package square;

public class Solution {
	public int numOfSquares(int n){
		if(n <= 0){
			return 0;
		}
		int [] M = new int [n + 1];
		M[0] = 0;
		for(int i = 1; i <= n; i ++){
			M[i] = i;
			for(int j = 1; j*j <= i; j++){
				M[i] = Math.min(1 + M[i-j*j], M[i]);
			}
		}
		return M[n];
	}
	public static void main(String [] args){
		Solution s = new Solution();
		System.out.println(s.numOfSquares(4));
	}
}
