package dataEstructures;

public class TreeNode<E> {
	
	private E element;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E element) {
		this.element = element;
	}
	
	public E getElement() {
		return element;
	}
	
	public void setElement(E element) {
		this.element = element;
	}
	
	public TreeNode<E> getParent() {
		return parent;
	}
	
	public void setParent(TreeNode<E> parent) {
		this.parent = parent;
	}
	
	public TreeNode<E> getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}
	
	public TreeNode<E> getRight() {
		return right;
	}
	
	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
	
}
