package Nqueen;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public List<List<Integer>> nqueensII(int n){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		//cur is the size of queen, cur[i] represents its column, i means its row.
		int[] cur = new int[n];
		boolean[] usedColumn = new boolean[n];
		boolean[] usedDiagonal = new boolean[2*n - 1];
		boolean[] usedRevdiagonal = new boolean[2*n - 1];
		helper(n,0,cur,result,usedColumn,usedDiagonal,usedRevdiagonal);
		return result;
	}
	
	private void helper(int n ,int row, int[] cur, List<List<Integer>> result, boolean[] usedColumn,
			boolean[] usedDiagonal,boolean [] usedRevdiagonal){
		//base case
		if(row == n){
			result.add(toList(cur));
			return;
		}
		for(int i = 0; i < n; i++){
			if(isValid(n,row,i,usedColumn,usedDiagonal,usedRevdiagonal)){
				mark(n,row,i,usedColumn,usedDiagonal,usedRevdiagonal);
				cur[row] = i;
				helper(n,row+1,cur,result,usedColumn,usedDiagonal,usedRevdiagonal);
				unmark(n,row,i,usedColumn,usedDiagonal,usedRevdiagonal);
			}
		}
	}
	
	private boolean isValid(int n, int row, int column, boolean[] usedColumn, boolean[] usedDiagnol,
			boolean[] usedRevdiagonal){
		return !usedColumn[column] && !usedDiagnol[column+row] && !usedRevdiagonal[column-row+n-1];
	}
	
	private void mark(int n, int row, int column, boolean[] usedColumn, boolean[] usedDiagnol,
			boolean[] usedRevdiagonal){
		usedColumn[column] = true;
		usedDiagnol[column + row] = true;
		usedRevdiagonal[column - row + n - 1] = true;
	}
	
	private void unmark(int n, int row, int column, boolean[] usedColumn, boolean[] usedDiagnol,
			boolean[] usedRevdiagonal){
				usedColumn[column] = false;
				usedDiagnol[column + row] = false;
				usedRevdiagonal[column - row + n - 1] = false;
	}
	
	private List<Integer> toList(int [] array){
		List<Integer> list = new ArrayList<>();
		for(int i : array){
			list.add(i);
		}
		return list;
	}
	
	public static void main (String [] args){
		Solution2 s = new Solution2();
		System.out.println(s.nqueensII(8));
	}
}
