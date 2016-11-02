import java.util.ArrayList;

//Klasse dient dem Erstellen einer neuen Kante

public class Edge {
	public Edge(Node node1, Node node2, int weigth){
		nodes = new ArrayList<Node>();
		nodes.add(node1);
		nodes.add(node2);
		this.weigth = weigth;
		this.name = node1.getName()+ node2.getName();
		node1.getLinkedNodes().add(node2);
		node2.getLinkedNodes().add(node1);
	}
	
	private ArrayList<Node> nodes;
	private int weigth;
	private String name;
	
	public String getName()
	{
		return name;
	}

	public int getWeigth() {
		return weigth;
	}

	public ArrayList<Node> getNodes( )
	{

		return nodes;
	}
	
	public boolean isNodeHere(Node node)
	{
		for (Node n : nodes)
		{
			if(node.equals(n))
			{
				return true;
			}
		}
		return false;
	}
	
}
