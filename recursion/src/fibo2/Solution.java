package fibo2;


public class Solution {
	 public long fibonacci(int K) {
		    // Write your solution here
			  if(K <= 0){
				  return 0;
			  }
			 long array [] = new long[K+1];
			 array[1]=1;
			 for (int i=2; i<=K; i++){
				 array[i] = array[i-1] + array[i-2];
			 }
	return array [K]; }


public static void main (String[] args){
    Solution s = new Solution();
    s.fibonacci(8);
    System.out.println();
}
}     