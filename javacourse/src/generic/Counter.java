package generic;

public class Counter {
   public void test(){
	   int a[] = new int[10];
	   for (int i = 0 ; i < 4; i++) {
		   for (int j = 0; j < 4; j++) {
			   a[0] = i;
			   a[1] = j;
			   testprint(a);
		   }
	   }
   }
   public void testprint (int [] a) {
	   System.out.println(a[0]);
	   System.out.println(a[1]);
   } 
   public static void main (String [] args){
	   Counter counter = new Counter();
	   counter.test();
   }
}
