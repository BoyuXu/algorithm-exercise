package nclosest;

public class Soliution {
	   public int[] kClosest(int[] array, int target, int k) {
		    // Write your solution here
		   if (array.length == 0 || array == null){
		   return array;
		   }
		   int left = 0;
		   int right = array.length - 1;
		   while(left <= right - 1){
		   int mid = left + (right - left)/2 ;
		   if(mid == target){
			   mid = right;
		   }
		   }
		   return array;
		  }
		}
