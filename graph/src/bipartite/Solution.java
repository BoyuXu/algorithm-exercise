package bipartite;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	  public boolean isBipartite(List<GraphNode> graph) {
		    // write your solution here
		   HashMap <GraphNode, Integer> visited = new HashMap<GraphNode,Integer>();
		   //use 0 and 1 represents different group
		   //do BFs for each node
		   for(GraphNode node:graph){
              if(!BFS(node, visited)){
            	  return false;
              }			   
		   }
		   return true;
		  }
	  private boolean BFS(GraphNode node, HashMap <GraphNode, Integer> visited){
		  if(visited.containsKey(node)){
			  return true;
		  }
		  Queue <GraphNode> queue = new LinkedList<GraphNode>();
		  //第一个Node放到0类中
		  queue.offer(node);
		  visited.put(node, 0);
		  //终止条件
		  while(!queue.isEmpty()){
			  GraphNode cur = queue.poll();
			  //确定其类组
			  int curgroup = visited.get(cur);
			  //设置邻居的组(与cur不同)
			  int neigroup = curgroup== 0 ? 1:0;
			  //没检查过的neighbor参加循环
			  for(GraphNode nei : cur.neighbors){
				  if(!visited.containsKey(nei)){
					  visited.put(nei, neigroup);
					  queue.offer(nei);
				  }
				  //group号不符合则说明出错
				  else if(visited.get(nei) != neigroup){
					  return false;
				  }
			  }
		  }
		  return true;
	  }
}


