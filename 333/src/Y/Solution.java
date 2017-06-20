package Y;

public class Solution {
	public float aa(int m){
		float s = 0;
		for (int i= 512;i<=m;i++){
			float x = (float) (1-Math.pow(1-0.00000001, i));
			s = s + x;
		}
		float a = s/(m-512+1);
		return a;
	}
	public static void main (String [] args){
		Solution a = new Solution();
		System.out.println(a.aa(19490));
	}
}
