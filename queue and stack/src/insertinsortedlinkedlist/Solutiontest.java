package insertinsortedlinkedlist;
import java.util.Arrays;
public class Solutiontest {
	    public static void main(String[] args){
	    	ListNode s1 = new ListNode(1);
	    	ListNode s2 = new ListNode(2);
	    	ListNode s3 = new ListNode(3);
	    	s1.next = s2;
	    	s2.next = s3;
	    	s3.next = null;
	    	//s3.next = null;
	    	System.out.println(s1);
	    	System.out.println(s2);
	    	System.out.println(s3);
	    	Solution s = new Solution();
	    	System.out.println(s.insert(s1, 4));
	    }
	}
