package bitoperation;

public class poweroftwo {
	public boolean isPowerOfTwo(int number) {
		if(number < 0){
			return false;
		}
		int count = 0;
		while(number > 0){
			count += number & 1;
			number >>>= 1;
		}
		return count == 1;
	}
	public static void main(String [] args){
		poweroftwo s = new poweroftwo();
		System.out.println(s.isPowerOfTwo(5));
	}
}
