package rainbowsort;
import java.util.Arrays;

public class Solutiontest {
	public static void main(String []args){
		Solution s = new Solution();
		int [] array0 = {};
		int [] array1 = {0};
		int [] array2 = {1,0};
		int [] array3 = {1,-1,0,1};
		array0 = s.rainbowsort(array0);
		array1 = s.rainbowsort(array1);
		array2 = s.rainbowsort(array2);
		array3 = s.rainbowsort(array3);
		System.out.println(Arrays.toString(array0));
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
	}
}
