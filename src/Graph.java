import java.util.ArrayList;

//Ziel

public class Graph {
	
	public Graph() {
		allNodes = new ArrayList<Node>();
		allEdges= new ArrayList<Edge>();
		
	} 
	
	private ArrayList<Node> allNodes;
	private ArrayList<Edge> allEdges;
	
	public void addNode(Node node)
	{
		allNodes.add(node);
	}
	
	public void addEdge(Edge edge)
	{
		allEdges.add(edge);
	}
	
	public Node giveNode(String ort)
	{
		for (Node n : allNodes)
		{
			
			if (n.getName().equals(ort))
			{
				
				return n;
			}
		}
		
		return null;
	}
	
	
	public ArrayList<Node> getAllNodes() {
		return allNodes;
	}


	public ArrayList<Edge> giveEdges(Node node)
	{
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		for (Edge e : allEdges)
		{
			if (e.isNodeHere(node))
			{
				edgeList.add(e);
			}
		}
		return edgeList;
	}
	
	public Edge giveEdge(Node node1, Node node2)
	{
		for (Edge e: allEdges)
		{
			if(e.isNodeHere(node1) && e.isNodeHere(node2))
			{
				return e;
			}
		}
		
		return null;
	}

}
