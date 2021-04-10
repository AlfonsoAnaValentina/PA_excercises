package prog_avanzada;

import java.util.List;

public class Node {
	private String value;
	private List<Node> children;
	private Node parent;
	
	@Override
	public String toString() {
		String concatChild = "";
		for (Node node : children) {
			concatChild += node.toString() + " ";
		}
		return value + "[ " + concatChild + " ]";
	}
	
	
	
	public Node(String string, List<Node> class1, Node parent) {
		this.value = string;
		this.children = class1;
		this.parent = parent;
	}

	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
