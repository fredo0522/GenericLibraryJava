package dataEstructures;

public class NodeKey<K, T> {
	private K key;
	private T element;
	private NodeKey<K, T> next;
	
	public NodeKey(K key, T element) {
		this.element = element;
		this.key = key;
	}
	
	public T getElement() {
		return element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public NodeKey<K, T> getNext(){
		return this.next;
	}
	
	public void setNext(NodeKey<K, T> next) {
		this.next = next;
	}
}
