package mincutsforpalindromes;

public class Solution {
	  public int minCuts(String input) {
	    // Write your solution here.
		  if(input == null || input.length() == 0){
			  return 0;
		  }
		  int length = input.length();
		  int [] cut = new int[length];
		  for(int i = 1; i < length; i++){
			  cut[i] = cut[i-1]+1;
			  if(ispalindromes(input,0,i)){
				  cut[i] = 0;
			  }
			  for(int j = i-1; j >= 0; j--){
				  if(ispalindromes(input,j+1,i)){
					  cut[i] = Math.min(cut[i],cut[j]+1);
				  }
			  }
		  }
		  return cut[length-1];
	  }
	  private boolean ispalindromes(String s, int j, int i){
		  for(int k = 0; k <= (i-j)/2; k++){
			  if(s.charAt(j+k) != s.charAt(i-k)){
				  return false;
			  }
		  }
		  return true;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(s.minCuts("abcbd"));
	  }
}
