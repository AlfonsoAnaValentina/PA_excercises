package prog_avanzada;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

public class TreeActions {
	
	public static void addNode(Node tree, Node newNode, String parent) { 
		if (tree.getValue().equals(parent)) {
			tree.getChildren().add(newNode);
		} else {
			List<Node> children = tree.getChildren();
			boolean found = false;
			int index = 0;
			while(!found && index < children.size()) {
				if (children.get(index).getValue().equals(parent)) {
					found = true;
				} else {
					index++;
					addNode(children.get(index), newNode, parent);
				}
				
			}
		}
		
	}
	
	public void deleteNode(Node deleteNode) {}
	
	public void findNode(Node findNode) {}
	
	public static void printTree(Node tree) {
		for (Node string : tree.getChildren()) {
			System.out.println(string.getValue());
			System.out.println(string.getChildren().size());
			printTree(string);
		}
	}

	private static BinaryNode addBNode(BinaryNode current, int value) {
		if (current == null) {
	        return new BinaryNode(value);
	    }

	    if (value < current.value) {
	        current.left = addBNode(current.left, value);
	    } else if (value > current.value) {
	        current.right = addBNode(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	public static void add(BinaryNode tree, int value) {
		BinaryNode root = addBNode(tree, value);
	}
	
	public static void traversePreOrder(StringBuilder sb, String padding, String pointer, BinaryNode node) {
	    if (node != null) {
	        sb.append(padding);
	        sb.append(pointer);
	        sb.append(node.getValue());
	        sb.append("\n");

	        StringBuilder paddingBuilder = new StringBuilder(padding);
	        paddingBuilder.append("│  ");

	        String paddingForBoth = paddingBuilder.toString();
	        String pointerForRight = "└──";
	        String pointerForLeft = (node.getRight() != null) ? "├──" : "└──";

	        traversePreOrder(sb, paddingForBoth, pointerForLeft, node.getLeft());
	        traversePreOrder(sb, paddingForBoth, pointerForRight, node.getRight());
	    }
	}
	
	public static void printBTree(PrintStream os, BinaryNode tree) {
		StringBuilder sb = new StringBuilder();
	    traversePreOrder(sb, "", "", tree);
	    os.print(sb.toString());
	}
	
	public static void traverseNPreOrder(StringBuilder sb, String padding, String pointer, Node node) {
	    if (node != null) {
	        sb.append(padding);
	        sb.append(pointer);
	        sb.append(node.getValue());
	        sb.append("\n");

	        StringBuilder paddingBuilder = new StringBuilder(padding);
	        

	        String paddingForBoth = paddingBuilder.toString();
	        String pointerForLast = "└──";
	        String pointerForLeft = (node.getChildren() != null) ? "├──" : "└──";
	        List<Node> auxNode = node.getChildren();
	        for (Node child : auxNode) {
	        	if (auxNode.indexOf(child) == (auxNode.size() -1)) {
	        		traverseNPreOrder(sb, paddingForBoth, pointerForLast, child);
	        	}  else {
	        		traverseNPreOrder(sb, paddingForBoth, pointerForLeft, child);
	        	}
			}
	        
	    }
	}
	
	public static void printNTree(PrintStream os, Node tree) {
		StringBuilder sb = new StringBuilder();
		System.out.println(tree);
	    traverseNPreOrder(sb, "", "", tree);
	    os.print(sb.toString());
	}
}
