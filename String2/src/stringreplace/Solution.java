package stringreplace;

import java.util.ArrayList;

public class Solution {
	  public String replace(String input, String s, String t) {
	    // Write your solution here.
		  char [] array = input.toCharArray();
		  if(s.length() >= t.length()){
			  return replaceshort(array, s, t);
		  }
		  return replacelong(array, s, t);
	  }
	  public String replaceshort(char[] array, String s, String t){
		  int slow = 0;
		  //for(int fast = 0; fast < array.length; fast++){
		  int fast = 0;
		  while(fast < array.length){
			  if(fast <= array.length - s.length() && equals(array,fast,s)){
				  copyString(array, slow, t);
				  slow += t.length();
				  fast += s.length();
			  }
			  else{
				  array[slow++] = array[fast++];
			  }
		  }
		  return new String(array, 0 ,slow);
	  }
	  
	  public String replacelong(char [] array, String s, String t){
		  ArrayList<Integer> matches = getAllmatches(array,s);
		  char [] result = new char [array.length + matches.size() * (t.length() - s.length())];
		  int lastIndex = matches.size() - 1;
		  int slow = array.length - 1;
		  int fast = result.length - 1;
		  while(slow >= 0){
			  if(lastIndex >= 0 && slow == matches.get(lastIndex)){
				  copyString(result, fast - t.length() + 1, t);
				  fast -= t.length();
				  slow -= s.length();
				  lastIndex --;
			  }
			  else{
				  result[fast--] = array[slow--];
			  }
		  }
		  return new String(result);
	  }
	  
	  private boolean equals(char[] array, int index, String s){
		  for(int i = 0; i < s.length(); i++){
			  if(array[i + index] != s.charAt(i)){
				  return false;
			  }
		  }
		  return true;
	  }
	  
	  private void copyString(char [] result, int index, String t){
		  for(int i = 0; i < t.length(); i++){
			  result[i + index] = t.charAt(i);
		  }
	  }
	  
	  private ArrayList<Integer> getAllmatches(char [] array,String s){
		  ArrayList<Integer> list= new ArrayList<Integer>();
		  int i = 0;
		  while(i <= array.length - s.length()){
			  if(equals(array, i, s)){
				  list.add(i + s.length() - 1);
				  i += s.length();
			  }
			  else{
				  i++;
			  }
		  }
		  return list;
	  }
	  
	  public static void main(String [] args){
		  Solution s = new Solution();
		  String a = "aab";
		  String b = "a";
		  String c = "b";
		  System.out.println(s.replace(a, b, c));
	  }
}

