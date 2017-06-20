package putchair;

import java.util.*;

import javax.naming.ldap.PagedResultsControl;
import javax.swing.Painter;

public class PlaceToPutChair {
	private static final char EQUIP = 'E';
	private static final char OB = 'O';
	
	public List<Integer> putchair(char [][] gym) {
		//list contains a pair representing its coordinates
		int m = gym.length;
		int n = gym[0].length;
		int [][] cost = new int [m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (EQUIP == gym[i][j]) {
					if (!addcost(cost, gym, i, j)) {
						return null;
					}
				}
			}
		}
		List<Integer> result = null;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (EQUIP != gym[i][j] && OB != gym[i][j]) {
					if (result == null) {
						result = Arrays.asList(i, j);
					} else if (cost[i][j] < cost[result.get(0)][result.get(1)]) {
						result.set(0, i);
						result.set(1, j);
					}
				}
			}
		}
		return result;		
	}
	
	private boolean addcost (int [][] cost, char [][] gym, int i, int j) {
		//bfs, use a visited boolean matrix;
		boolean [][] visited = new boolean[gym.length][gym[0].length];
		int pathcost = 1;
		Queue<Pair> queue = new LinkedList<>();
		visited[i][j] = true;
		queue.offer(new Pair(i, j));
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int k = 0; k < size; k++) {
				Pair cur = queue.poll();
				List<Pair> neis = getNeis(cur,gym);
				for (Pair nei: neis) {
					if (!visited[nei.i][nei.j]) {
						visited[nei.i][nei.j] = true;
						cost[nei.i][nei.j] += pathcost;
						queue.offer(nei);
					}
				}
			}
			pathcost++;
		}
		for (int l = 0; l < gym.length; l++) {
			for (int m = 0; m < gym[0].length; m++) {
				if (!visited[l][m] && EQUIP == gym[l][m]) {
					return false;
				}
			}
		}
		return true;
	}
	
	private List<Pair> getNeis(Pair cur, char[][]gym) {
		int x = cur.i;
		int y = cur.j;
		int m = gym.length;
		int n = gym[0].length;
		List<Pair> neis = new ArrayList<>();
		if (x + 1 < m && OB != gym[x + 1][y]) {
			neis.add(new Pair(x + 1, y));
		}
		if (y + 1 < n && OB != gym[x][y + 1]) {
			neis.add(new Pair(x, y + 1));
		}
		if (x - 1 >= 0 && OB != gym[x - 1][y]) {
			neis.add(new Pair(x - 1, y));
		}
		if (y - 1 < n && OB != gym[x][y - 1]) {
			neis.add(new Pair(x, y - 1));
		}
		return neis;
	}
	
	static class Pair {
		int i;
		int j;
		Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
}
