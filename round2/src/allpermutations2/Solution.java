package allpermutations2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	 public List<String> permutations(String set) {
		 // Write your solution here.
		 List<String> list = new ArrayList<>();
		 if(set == null || set.length() == 0){
			 return list;
		 }
		 char [] array = set.toCharArray();
		 getpermutations(array, 0 , list);
		 return list;
	 }
	 public void getpermutations(char [] array, int index, List<String> list){
		 if(index == array.length){
			 list.add(new String (array));
			 return;
		 }
		 Set<Character> set = new HashSet<>();
		 for(int i = index; i < array.length; i++){
			 if(!set.contains(array[i])){
				 set.add(array[i]);
				 swap(array, index, i);
				 getpermutations(array, index + 1, list);
				 swap(array, index, i);
			 }
		 }
	 }
	 private void swap(char [] array,int i,int j){
		 char temp = array[i];
		 array[i] = array[j];
		 array[j] = temp;
	}
	 public static void main(String [] args){
		 Solution s = new Solution();
		 String set = "abbc";
		 System.out.println(s.permutations(set));
	 }
}
