package bitoperation;

public class allunique {
	 public boolean allUnique(String word) {
		 // write your solution here
		 int map = 0;
		 int n = word.length();
		 for(int i = 0; i < n; i++){
			 if((1 << (word.charAt(i) - 'a') & map) != 0){
				 return false;
			 }else {
				map |= 1 << (word.charAt(i) - 'a'); 
			 }
		 }
		 return true;
	 }
	 public static void main (String [] args){
		 allunique s = new allunique();
		 System.out.println(s.allUnique("abcda"));
	 }
}
