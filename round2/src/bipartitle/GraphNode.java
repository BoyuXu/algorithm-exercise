package bipartitle;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	public int key;
	public List<GraphNode> neighbor;
	public GraphNode(int key){
		this.key = key;
		this.neighbor = new ArrayList<GraphNode>();
	}
}
