import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graf = new Graph();
		String berlin = "berlin";
		Node berlinNode = new Node(berlin);
		Node stuttgartNode = new Node("stuttgart");
		Node frankfurtNode = new Node("frankfurt");
		Node strausbergNode = new Node("strausberg");
		Edge berlinStuttgart = new Edge(berlinNode, stuttgartNode, 20);
		Edge berlinFrankfurt = new Edge(berlinNode, frankfurtNode, 15);
		Edge berlinStrausberg = new Edge(berlinNode, strausbergNode, 10);
		Edge strausbergFrankfurt = new Edge(strausbergNode, frankfurtNode, 4);
		Edge frankfurtStuttgart = new Edge(frankfurtNode, stuttgartNode, 10);
		
		graf.addEdge(berlinStrausberg);
		graf.addEdge(berlinStuttgart);
		graf.addEdge(berlinFrankfurt);
		graf.addEdge(strausbergFrankfurt);
		graf.addEdge(frankfurtStuttgart);
		graf.addNode(strausbergNode);
		graf.addNode(frankfurtNode);
		graf.addNode(stuttgartNode);
		graf.addNode(berlinNode);
		
		Dijkstra d = new Dijkstra(graf, "berlin", "frankfurt");
		
		Node node=graf.giveNode("berlin");
		ArrayList<Edge> edges= new ArrayList<Edge>();
		edges.addAll(graf.giveEdges(node));
		
		for (Edge e: edges)
		{
			System.out.println(e.getName());
		}
		
		
	}
	
}
