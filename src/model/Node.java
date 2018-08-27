package model;

public class Node<P>{
	
	private P info;
	private Node<P> next;
	
	public Node(P element) {
		this.info = element;
	}
	
	public Node(P element, Node<P> next) {
		this.info = element;
		this.next = next;
	}
	
	public P getElement() {
		return info;
	}
	
	public Node<P> getNext() {
		return next;
	}
	
	public void setElement(P element) {
		this.info = element;
	}
	public void setNext(Node<P> next) {
		this.next = next;
	}
}
