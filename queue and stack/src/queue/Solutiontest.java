package queue;

public class Solutiontest {
     public static void main(String []args){
    	 Solution s = new Solution();
    	 s.in.add(2);
         s.in.add(3);
    	 s.in.offer(1);
    	 s.in.peek();
     System.out.println(s.in);//
     }
}
