package bipartitle;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	  public boolean isBipartite(List<GraphNode> graph) {
		  HashMap<GraphNode, Integer> visited = new HashMap<>();
		  for(GraphNode node : graph){
			  if(!BFS(node,visited)){
				  return false;
			  }
		  }
		  return true;
	  }
	  private boolean BFS(GraphNode node, HashMap<GraphNode,Integer> visited){
		  if(visited.containsKey(node)){
			  return true;
		  }
		  Queue<GraphNode> queue = new LinkedList<GraphNode>();
		  queue.offer(node);
		  visited.put(node, 0);
		  while(!queue.isEmpty()){
			  GraphNode cur = queue.poll();
			  int curgroup = visited.get(cur);
			  int neigroup = curgroup == 0 ? 1 : 0;
			  for(GraphNode nei : node.neighbor){
				  if(!visited.containsKey(nei)){
					  visited.put(nei, neigroup);
					  queue.offer(nei);
				  }
				  else if(visited.get(nei) != neigroup){
					  return false;
				  }
			  }
		  }
		  return true;
	  }
}
