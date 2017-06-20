
public class averagebitoverhead {
    public float averageoverhead(int n,int m){
    // n denotes string length, m denotes number of trial
    // ave denotes the average number of insert “1” in the string length of n.
    // b denotes the average bit stuffing overhead
    	float ave = 0; 
    	float p = 0;
    	float b = 0;
    	for(int x = 0; x < m; x++){	
    		// s denotes the number of insert "1" in each trial
    		// j denotes the number of consecutive 1
    		int s = 0;
    		int j = 0;
    		for(int num = 0; num<n; num++){
    			int a = Math.random() <= 0.5? 0:1;
    			if (a == 0){
    				j=0;
    			}
    			else{ 
    				j++;
    			}
    			if(j==6){
    				j=0;
    				s=s+1;
    			}
    		}	 
    		p = p + s; 
    		ave = (p/m);
    		b = ave/n;
    	}
    return b;
    }
    public static void main (String [] args){
    averagebitoverhead s = new averagebitoverhead();
    System.out.println(s.averageoverhead(1000,10000));
    }
}
