package abbreviation;

public class Solution {
	public boolean match(String input, String pattern) {
		// Write your solution here.
		return ifmatch(input, pattern,0,0);
	}
	private boolean ifmatch(String input, String pattern, int i, int j){
		if(i == input.length() && j == pattern.length()){
			return true;
		}
		if(i >= input.length() || j >= pattern.length()){
			return false;
		}
		// case 1, not digit, use method: input.charAt(i)
		if (pattern.charAt(j) < '0' || pattern.charAt(j) > '9'){
			if(input.charAt(i) == pattern.charAt(j)){
				return ifmatch(input, pattern, i+1, j+1);
			}
			else{
				return false;
			}
		}
		// case 2, digit
		int count = 0;
		while (j < pattern.length() && pattern.charAt(j)>='0' && pattern.charAt(j) <= '9'){
			count = count*10 + (pattern.charAt(j) - '0');
			j++;
		}
		return ifmatch(input, pattern, i+count, j);
	}
	public static void main (String [] args){
		Solution s = new Solution();
		System.out.println(s.match("apple", "2p1"));
	}
}
