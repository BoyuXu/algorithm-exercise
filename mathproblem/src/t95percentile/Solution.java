package t95percentile;

import java.util.List;

public class Solution {
	  public int percentile95(List<Integer> lengths) {
	    // Write your solution here.
	    int [] count = new int [4097];
	    for(int len:lengths){
	      count[len]++;
	    }
	    int sum = 0;
	    int len = 4097;
	    while(sum <= 0.05*lengths.size()){
	      sum += count[--len];
	    }
	    return len;
	  }
	}

