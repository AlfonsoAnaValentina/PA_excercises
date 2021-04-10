package prog_avanzada;

import java.io.PrintStream;

public class BinaryNode {
	int value;
	BinaryNode left;
	BinaryNode right;

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	
	BinaryNode(int value) {
        this.value = value;
        right = null;
        left = null;
    }
	
	
	
}
