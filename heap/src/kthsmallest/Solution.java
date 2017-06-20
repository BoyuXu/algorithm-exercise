package kthsmallest;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	  public int kthSmallest(int[] A, int [] B, int k) {
		    // aldx, bldx represents the xth element of the A or B
				  int a = A.length;
				  int b = B.length;
				  PriorityQueue <Cell> minheap = new PriorityQueue <Cell>(k, new Comparator<Cell>(){ 
					@Override
					public int compare(Cell c1, Cell c2) {
						// TODO Auto-generated method stub
						// use equals to 
						int sum1 = c1.aldx + c1.bldx;
						int sum2 = c2.aldx + c2.bldx;
						if(sum1 == sum2){
							return 0;
						}
						return sum1 > sum2 ? 1 : -1;
					}
				  });
				  // generated node to be true， 防止被再次取出
				  boolean [][] visited = new boolean [A.length][B.length];
				  minheap.offer(new Cell(0,0));
				  visited [0][0] = true;
				  for(int i=0; i<k-1; i++){
					  Cell cur = minheap.poll();
					  //base case：没有出界，没有被generated过!!!
					  if (cur.aldx < A.length && !visited[cur.aldx+1][cur.bldx]){
						  minheap.offer(new Cell(cur.aldx+1,cur.bldx));
						  visited[cur.aldx+1][cur.bldx]=true;
					  }
					  if (cur.bldx+1 < B.length && !visited[cur.aldx][cur.bldx+1]){
						  minheap.offer(new Cell(cur.aldx,cur.bldx+1));
						  visited[cur.aldx][cur.bldx+1]=true;
					  }
				  }
				  Cell p = minheap.peek();
				  return A[p.aldx]+B[p.bldx];
				  }
			class Cell{
					  int aldx;
					  int bldx;
					  Cell(int aldx,int bldx){
						  this.aldx = aldx;
						  this.bldx = bldx;
					  }
				  }
				}