package weekFourTreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class Q2FindPathInDirected {
	
	static Q2bGraph createGraph() {
		Q2bGraph graph = new Q2bGraph();
		Q2aNode[] temp = new Q2aNode[6]; 
		

		temp[0] = new Q2aNode("a", 3);
		temp[1] = new Q2aNode("b", 0);
		temp[2] = new Q2aNode("c", 0);
		temp[3] = new Q2aNode("d", 1);
		temp[4] = new Q2aNode("e", 2);
		temp[5] = new Q2aNode("f", 0);

		temp[0].addAdjNode(temp[1]);
		temp[0].addAdjNode(temp[2]);
		temp[0].addAdjNode(temp[3]);
		temp[3].addAdjNode(temp[4]);
		temp[4].addAdjNode(temp[5]);
		temp[4].addAdjNode(temp[0]);
		
		for (int i = 0; i < 6; i++) {
			graph.addVertice(temp[i]);
		}
		
		return graph;
	}
	
	static String bfsSearch(Q2bGraph g, Q2aNode start, Q2aNode end) {
		Queue<Q2aNode> q = new LinkedList<>();
		q.add(start);
		start.visited = true;
		while(!q.isEmpty()) {
			Q2aNode cur = q.remove();
			for(Q2aNode adjNode : cur.getAdj()) {
				if(adjNode != null && adjNode.visited != true) {
					if(adjNode == end)
						return "Found a Path";
					q.add(adjNode);
					adjNode.visited = true;
				}
			}
		}
		
		return "No path Found";
	}
	
	static boolean dfsSearch(Q2bGraph g, Q2aNode curNode, Q2aNode end) {
		
		if(curNode == null || curNode.visited)
			return false;

		System.out.println(curNode.vertex);
		curNode.visited = true;
		if(curNode == end)
		{
			System.out.println("End");
			return true;
		}
		boolean res = false;
		for(Q2aNode adjNode: curNode.getAdj()) {
			res = dfsSearch(g, adjNode, end);
			if(res)
				break;
		}
		
		return res;
	}

	public static void main(String[] args) {
		Q2bGraph graph = createGraph();
		Q2aNode[] n = graph.getNodes();
		
		Q2aNode start = n[0];
		Q2aNode end = n[5];
//		System.out.println(bfsSearch(graph, start, end));
		System.out.println(dfsSearch(graph, start, end));
	}
	
	
}
