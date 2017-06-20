package bitoperation;

public class differentbit {
	 public int diffBits(int a, int b) {
		 // Write your solution here.
		 a = a^b;
		 int count = 0;
		 while(a != 0){
			 count += a & 1;
			 a >>>= 1;
		 }
		 return count;
	 }
}
