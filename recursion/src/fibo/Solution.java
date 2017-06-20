package fibo;

public class Solution {
		  public long fibonacci(int K) {
		    // Write your solution here
			  if(K <= 0){
				  return 0;
			  }
			  if(K == 1){
				  return 1;
			  }
			  else{
				  return fibonacci(K-1)+fibonacci(K-2);
			  }
		  }

     public void main(int m){
	       Solution s = new Solution();
	       for (int i=0; i<m;i++){
	       System.out.println( s.fibonacci(i));
	       }
     }
}     
