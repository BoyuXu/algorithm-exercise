package allfactors;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private void helper(List<List<Integer>> result,List<Integer> cur, List<Integer> factors, int target, int index, int number[]){
		if(index == factors.size()){
			if(target == 1){
				result.add(new ArrayList<>(cur));
			}
			return;
		} 
		for(int i = 0; i <= number[index] ;i++){
			int left = target;
			for (int j = 0; j < i; j++){
				 left = left / factors.get(index);
			}
			cur.add(i);
			helper(result, cur, factors, left, index + 1, number);
			cur.remove(cur.size() - 1);
		}
	}
}
