package validparanthese;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<String> validParentheses(int n) {
		    // Write your solution here.
		  List<String> result = new ArrayList<String>();
		  //最长的char有2n个char
		  char [] cur = new char[n*2];
		  helper1(cur, n , n, 0, result);
		  return result;
		  }
	 
	 private void helper1(char[] cur, int left, int right, int index, List<String>result){
		 if(left == 0 && right == 0){
			 result.add(new String(cur));
			 return;
		 }
		 //判断左括号
		 if(left > 0 ){
			 cur[index] ='(';
			 helper1(cur, left-1, right, index+1, result);
		 }
		 //判断右括号
		 if(right > left){
			 cur[index] = ')';
			 helper1(cur, left, right-1, index+1, result);
		 }
	 }
	 public static void main(String [] args){
		 Solution s = new Solution();
		 System.out.println(s.validParentheses(3));
	 }
}
