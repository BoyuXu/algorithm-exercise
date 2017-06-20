package quicksort;
import java.util.Arrays;

public class Solutiontest {
	public static void main(String []args){
       
       int a2[]={4,3,2,1,6,7,8,9};
       Solution S= new Solution();
       
       S.quickSort(a2);
       System.out.print(Arrays.toString(a2));
  
	}
}
