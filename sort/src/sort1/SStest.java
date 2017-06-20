package sort1;
import java.util.Arrays;
public class SStest  {
	public static void main(String []args){
       
       int a3[]={1,3,6,2,8,4,5};
       Solution S= new Solution();
       
       S.quickSort(a3);
       System.out.print(Arrays.toString(a3));
  
	}
}


