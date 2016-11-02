import java.util.ArrayList;

public class Dijkstra {

	
	public Dijkstra (Graph graph, String start, String ende)
	{
		this.graph = graph;
		startNode=graph.giveNode(start);
		endNode=graph.giveNode(ende);
		if (startNode==null || endNode==null)
		{
			System.out.println("Node gibt es nicht");
		}
		else
		{
			initialisierung();
		}
		
	}
	
	private Graph graph;
	private Node startNode;
	private Node endNode;

	
	private void initialisierung()
	{
		ArrayList<Node> allNodes = new ArrayList<Node>();
	
		allNodes.addAll(graph.getAllNodes());
		
		for(Node n: allNodes)
		{
			n.setDistanz(Integer.MAX_VALUE);
		}
		
		startNode.setDistanz(0);
		startNode.setStrecke(startNode.getName());
		Node currNode = startNode;
		
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		visitedNodes.add(startNode);
		while(endNode!=currNode)
		{
			ArrayList<Node> linkedNodes = currNode.getLinkedNodes();
			for (int i=0; i<linkedNodes.size(); i++)
			{
				if(visitedNodes.contains(linkedNodes.get(i)))
				{
					System.out.println("Node löschen: "+linkedNodes.get(i).getName());
					linkedNodes.remove(linkedNodes.get(i));
					i--;
				}
				else
				{
					Edge edge=graph.giveEdge(currNode, linkedNodes.get(i));
					int weigth=edge.getWeigth();
					int newDistanz= currNode.getDistanz()+weigth;
					if(linkedNodes.get(i).getDistanz()>newDistanz)
					{
						linkedNodes.get(i).setDistanz(newDistanz);
						linkedNodes.get(i).setStrecke(currNode.getStrecke()+ ", " +linkedNodes.get(i).getName()+", ");
					}
				}
			}
			
			currNode= getLowestDistanceNode(linkedNodes);
			visitedNodes.add(currNode);
		}
		System.out.println("Distanz: "+currNode.getDistanz());
		System.out.println("Strecke: "+currNode.getStrecke());
	}
	
	private Node getLowestDistanceNode(ArrayList<Node> linkedNodes)
	{
		Node minNode = linkedNodes.get(0);
		for(Node n: linkedNodes)
		{
			if (minNode.getDistanz() > n.getDistanz())
			{
				minNode=n;
			}
		}
		System.out.println("minNode : "+minNode.getName());
		return minNode;
	}
}
