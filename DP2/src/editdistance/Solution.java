package editdistance;

public class Solution {
	public int editDistance(String one, String two) {
	// Write your solution here.
		int [][]distance = new int [one.length() + 1][two.length() + 1];
		for(int i = 0;i <= one.length();i++){
			for(int j = 0;j <= two.length();j++){
				if(i==0){
		    		distance[0][j] = j;
		    	}
				else if(j==0){
		    		distance[i][0] = i;
		    	}
				else if(one.charAt(i-1) == two.charAt(j-1)){
					distance[i][j] = distance[i-1][j-1];
				}
				else{
					distance[i][j] = Math.min(distance[i-1][j]+1, distance[i][j-1]+1);
					distance[i][j] = Math.min(distance[i][j], distance[i-1][j-1]+1);
				}
			}
		}
		return distance[one.length()][two.length()];
	}
	public static void main (String [] args){
		Solution s = new Solution();
		System.out.println(s.editDistance("apple","abble"));
	}
}
