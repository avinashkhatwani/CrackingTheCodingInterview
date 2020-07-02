package weekFourTreesAndGraphs;

public class Q2bGraph {
	int nodeCount = 0;
	Q2aNode[] vertices;
	
	public Q2bGraph() {
		vertices = new Q2aNode[6];
		nodeCount = 0;
	}
	
	void addVertice(Q2aNode node) {
		vertices[nodeCount] = node;
		nodeCount+=1;
	}
	
	Q2aNode[] getNodes() {
		return vertices;
	}
}
