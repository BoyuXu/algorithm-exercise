package Nqueen;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public List<List<Integer>> nqueens(int n) {
		// Write your solution here.
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> cur = new ArrayList<Integer>();
		helper(n, cur, result);
		return result;
	}
	public void helper(int n, List<Integer> cur, List<List<Integer>> result){
		if(cur.size() == n){
			result.add(new ArrayList<Integer>(cur));
			return;
		}
		for(int i = 0; i < n; i++){
			if(valid(cur,i)){
				cur.add(i);
				helper(n, cur, result);
				cur.remove(cur.size()-1);
			}
		}
	}
	private boolean valid(List<Integer> cur,int column){
		int row = cur.size();
		for(int i = 0; i < row; i++){
			if(cur.get(i) == column || Math.abs(cur.get(i) - column) == row-i){
				return false;
			}
		}
		return true;
	}
	public static void main (String [] args){
		Solution s = new Solution();
		System.out.println((s.nqueens(4)));
	}
}
