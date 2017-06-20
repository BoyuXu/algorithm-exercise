package iscircle;

public class Solution {
	public boolean iscircle(String [] input){
		if(input == null || input.length == 0){
			return false;
		}
		if(input.length == 1){
			return input[0].charAt(input[0].length()) == input[0].charAt(input[0].length()-1);
		}
		boolean [] flag = new boolean[1];
		helper(input, flag, 0);
		return flag[0];
	}
	private boolean helper(String [] input, boolean[] flag, int level){
		if(level == input.length){
			String last = input[input.length - 1];
			String first = input[0];
			if(last.charAt(last.length()-1) == first.charAt(0)){
				return true;
			}
			return false;
		}
		for(int i = level; i < input.length; i++){
			if(level == 0 || input[i].charAt(0) == input[level-1].charAt(input[level-1].length()-1)){
				swap(input, level, i);
				if(helper(input, flag, level + 1)){
					flag[0] = true;
				}
				swap(input, level, i);
			}
		}
		return flag[0];
	}
	private void swap(String[] input, int i, int j){
		String temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	public static void main(String [] args){
		Solution s = new Solution();
		String [] input = {"aaa","abb","baa"};
		System.out.println(s.iscircle(input));
	}
}
