package dataEstructures;

public class RedBlackNode<E> {
	
	public static final boolean RED = true;
	public static final boolean BLACK = false;
	
	private E element;
	private RedBlackNode<E> left;
	private RedBlackNode<E> right;
	private RedBlackNode<E> parent;
	private boolean color;
	
	public RedBlackNode(E element) {
		this.element = element;
		this.color = true;
	}
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public RedBlackNode<E> getLeft() {
		return left;
	}
	public void setLeft(RedBlackNode<E> left) {
		this.left = left;
	}
	public RedBlackNode<E> getRight() {
		return right;
	}
	public void setRight(RedBlackNode<E> right) {
		this.right = right;
	}
	public RedBlackNode<E> getParent() {
		return parent;
	}
	public void setParent(RedBlackNode<E> parent) {
		this.parent = parent;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	
}
