package coin;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinations(int target, int[] coins) {
	    // Write your solution here.
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> cur = new ArrayList<Integer>();
		helper(result, cur, coins, target, 0);
		return result;
	}
	private void helper(List<List<Integer>> result,List<Integer> cur, int[] coins, int target, int index){
		if(index == coins.length){
			if(target == 0){
				result.add(new ArrayList(cur));
			}
			return;
		}
		for(int i = 0; i <= target / coins[index]; i++){
			int left = target - coins[index] * i;
			cur.add(i);
			helper(result, cur, coins, left, index + 1);
			cur.remove(cur.size() - 1);
		}
	}
	public static void main (String [] args){
		Solution s = new Solution();
		int[] coins = {10,5,2,1};
		System.out.println(s.combinations(10, coins).toString());
	}
}
