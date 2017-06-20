package permutationofstrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> getallpermutations(char [] input){
		List<String> result = new ArrayList<>();
		if(input == null || input.length == 0){
			return result;
		}
		StringBuilder sb = new StringBuilder();
		helper(result, input, sb, 0);
		return result;
	}
	private void helper(List<String> result, char [] input, StringBuilder sb, int index){
		if(index == input.length){
			sb.append(input[index]);
			result.add(new String(sb));
			sb.deleteCharAt(sb.length() - 1);
			return;
		}
		sb.append(input[index]);
		//add kong
		sb.append("1");
		helper(result, input, sb, index + 1);
		sb.deleteCharAt(sb.length() - 1);
		//not add
		helper(result, input, sb, index + 1);
		sb.deleteCharAt(sb.length() - 1);
	}
	public static void main(String [] args){
		Solution s = new Solution();
		char [] array = {'a','b','c'};
		System.out.println(s.getallpermutations(array));
	}
}
