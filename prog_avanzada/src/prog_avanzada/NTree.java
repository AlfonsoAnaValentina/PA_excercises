package prog_avanzada;

import java.util.ArrayList;

public class NTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node tree = new Node("m", new ArrayList<Node>(), null);
		Node newNode = new Node("o", new ArrayList<Node>(), null);
		Node newNode2 = new Node("b", new ArrayList<Node>(), null);
		Node newNode3 = new Node("y", new ArrayList<Node>(), null);
		Node subNode1 = new Node("a", new ArrayList<Node>(), null);
		Node subNode2 = new Node("c", new ArrayList<Node>(), null);
		TreeActions.addNode(tree, newNode, "m");
		TreeActions.addNode(tree, newNode2, "m");
		TreeActions.addNode(tree, newNode3, "m");
		TreeActions.addNode(tree, subNode1, "b");
		TreeActions.addNode(tree, subNode2, "b");
		//TreeActions.addNode(tree, subNode2, "b");
		//System.out.println(tree.toString());
		TreeActions.printNTree(System.out, tree);
		
		BinaryNode bTree = new BinaryNode(20);
		TreeActions.add(bTree, 12);
		TreeActions.add(bTree, 50);
		TreeActions.add(bTree, 6);
		TreeActions.add(bTree, 30);
		TreeActions.add(bTree, 15);
		TreeActions.add(bTree, 16);
		TreeActions.printBTree(System.out, bTree);
	}

}
