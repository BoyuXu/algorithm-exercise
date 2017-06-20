package ifissub;

public class Solution {
	  public int strstr(String large, String small) {
	    // write your solution here
		  if(large.length() < small.length()){
			  return -1;
		  }
		  if(small.length() == 0){
			  return 0;
		  }
		  for(int i = 0; i <= large.length() - small.length(); i++){
			  if(equals(large,i,small)){
				  return i;
			  }
		  }
		  return -1;
	  }
	  private boolean equals(String large, int start, String small){
		  for(int i = start; i < start + small.length(); i++){
			  if(large.charAt(i)!=small.charAt(i-start)){
				  return false;
			  }
		  }
		  return true;
	  }
	  public static void main (String [] args){
		  Solution s = new Solution();
		  System.out.println(s.strstr("aabbaabbaabbccaabbaabbaabbaabbcc", "aabbaabbaabbaabbcc"));
	  }
}
