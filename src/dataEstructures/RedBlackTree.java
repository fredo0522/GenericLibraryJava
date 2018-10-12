package dataEstructures;

public class RedBlackTree<E extends Comparable<E>> implements TreeInterface<E> {

	private RedBlackNode<E> root;
	private long size;
	
	
	public RedBlackTree() {
		this.root = null;
		this.size = 0;
	}
	
	@Override
	public void insert(E element) {
		RedBlackNode<E> adding = new RedBlackNode<>(element);
		if(this.root == null) {
			this.root = adding;
			root.setColor(false);
			size++;
		}else{
			insert(adding);
		}
	}
	
	private boolean insert(RedBlackNode<E> adding) {
		return false;
	}
	
	private void leftRotate(RedBlackNode<E> current) {
		
	}
	
	private void rightRotate(RedBlackNode<E> current) {
		
	}
	
	private void reColor(RedBlackNode<E> current) {
		if(current.isColor()) current.setColor(false);
		else current.setColor(true);
	}
	

	@Override
	public boolean delete(E element) {
		return false;
	}

	@Override
	public E search(E element) {
		return search(this.root, element).getElement();
	}
	
	private RedBlackNode<E> search(RedBlackNode<E> current, E element){
		if(current == null || current.getElement().compareTo(element) == 0) return current;
		if(element.compareTo(current.getElement()) > 0) return search(current.getRight(), element);
		else return search(current.getLeft(), element);
	}

	@Override
	public boolean isEmpty() {
		return (this.root == null && this.size == 0);
	}

	@Override
	public E root() {
		return this.root.getElement();
	}

	@Override
	public E max() {
		return max(this.root).getElement();
	}
	
	private RedBlackNode<E> max(RedBlackNode<E> current){
		if(current.getRight() == null) return current;
		else return max(current.getRight());
	}

	@Override
	public E min() {
		return min(this.root).getElement();
	}
	
	private RedBlackNode<E> min(RedBlackNode<E> current){
		if(current.getLeft() == null) return current;
		else return min(current.getLeft());
	}

	@Override
	public long size() {
		return this.size;
	}

}
