package permutation22;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution{
	public int ksmallest(int[] a, int [] b ,int k){ // Why do you return an int array? We only want the k-th smallest, right? Not all of them
         if ((a.length == 0 && b.length == 0) || k == 0){
                   return 0;
         }
         PriorityQueue <Integer> maxheap = new PriorityQueue <Integer>(k,new Comparator<Integer>()
           {@Override
        	 public int compare(Integer o1, Integer o2) {
                     if(o1.equals(o2)){
                       	return 0;
                      	}
                     return o1 > o2 ? -1 : 1;
                      	}
            }); // Why do you want a max heap?
          	int m = a.length; 
          	int n = b.length;
          	int [] c = new int [m*n];
            for (int i = 0; i < a.length; i++){
            	for(int j = 0; j < b.length; j++){
           		     int d = a[i] + b[j];
        		      c [m*(j-1) +i] = d; // What is c, I do not see any definition of c.
                }
            }
            for (int i = 0; i < c.length; i++){ // If you use the brute force way to generate all those pairs, then what are the advantages of using a heap here?
                 if(i<k){
                	 maxheap.offer(c[i]);
                 }
                 else if(c[i] < maxheap.peek()){
                         maxheap.poll();
                         maxheap.offer(c[i]);
                 }
            }
            return maxheap.poll();
 }
}