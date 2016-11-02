import java.awt.List;
import java.util.ArrayList;

//Klasse dient dem Erstellen eines neuen Knotenpunktes 

public class Node {
	public Node(String name) {
		linkedNodes = new ArrayList <Node>();
		 this.name = name ;
		 strecke="";
		
	}
	
	private ArrayList<Node> linkedNodes;
	private String name; 
	private int distanz;
	private String strecke;
	
	public ArrayList<Node> getLinkedNodes() {
		return linkedNodes;
	}

	public int getDistanz() {
		return distanz;
	}

	public void setDistanz(int distanz) {
		this.distanz = distanz;
	}

	public String getName()
	{
		return name;
	}

	public String getStrecke() {
		return strecke;
	}

	public void setStrecke(String strecke) {
		this.strecke = strecke;
	}
	
	
}
