package weekFourTreesAndGraphs;

public class Q2aNode {

	Q2aNode[] adj = null;
	int adjCount = 0;
	String vertex;
	boolean visited = false;
	
	public Q2aNode(String name, int adjLen) {
		adjCount = 0;
		vertex = name;
		adj = new Q2aNode[adjLen];
	}
	
	public void addAdjNode(Q2aNode node) {
		this.adj[adjCount] = node;
		adjCount+=1;
	}
	
	public Q2aNode[] getAdj() {
		return adj;
	}
	
	public String getVertex() {
		return vertex;
	}
	
}
