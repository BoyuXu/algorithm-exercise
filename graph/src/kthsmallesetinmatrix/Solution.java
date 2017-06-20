package kthsmallesetinmatrix;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	  public int kthSmallest(int[][] matrix, int k) {
		    // Write your solution here.
				  int rows = matrix.length;
				  int col = matrix[0].length;
				  PriorityQueue <Cell> minheap = new PriorityQueue <Cell>(k, new Comparator<Cell>(){ 
					@Override
					public int compare(Cell c1, Cell c2) {
						// TODO Auto-generated method stub
						// use equals to 
						if(c1.value == c2.value){
							return 0;
						}
						return c1.value > c2.value ? 1 : -1;
					}
				  });
				  // generated node to be true， 防止被再次取出
				  boolean [][] visited = new boolean [rows][col];
				  minheap.offer(new Cell(0,0,matrix[0][0]));
				  visited [0][0] = true;
				  for(int i=0; i<k-1; i++){
					  Cell cur = minheap.poll();
					  //base case：没有出界，没有被generated过
					  if (cur.row+1 < rows && !visited[cur.row+1][cur.column]){
						  minheap.offer(new Cell(cur.row+1,cur.column,matrix[cur.row+1][cur.column]));
						  visited[cur.row+1][cur.column]=true;
					  }
					  if (cur.column+1 < col && !visited[cur.row][cur.column+1]){
						  minheap.offer(new Cell(cur.row,cur.column+1,matrix[cur.row][cur.column+1]));
						  visited[cur.row][cur.column+1]=true;
					  }
				  }
				  return minheap.peek().value;
				  }
			class Cell{
					  int row;
					  int column;
					  int value;
					  Cell(int row,int column,int value){
						  this.row = row;
						  this.column = column;
						  this.value = value;
					  }
				  }
				}