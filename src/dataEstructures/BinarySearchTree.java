package dataEstructures;

public class BinarySearchTree<E extends Comparable<E>> implements TreeInterface<E>{
	
	private TreeNode<E> root;
	private long size;
	
	public BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}
	
	@Override
	public void insert(E element) {
		if(this.root == null) {
			root = new TreeNode<E>(element);
			size++;
		}else {
			insert(this.root, element);
		}
	}
	
	private void insert(TreeNode<E> node, E element) {
		int compare = node.getElement().compareTo(element);
		if(compare < 0) {
			if(node.getLeft() == null) {
				TreeNode<E> add = new TreeNode<E>(element);
				add.setParent(node);
				node.setLeft(add);
				size++;
				return;
			}
			insert(node.getLeft(), element);
		}else if (compare > 0){
			if(node.getRight() == null) {
				TreeNode<E> add = new TreeNode<E>(element);
				add.setParent(node);
				node.setRight(add);
				size++;
				return;
			}
			insert(node.getRight(), element);
		}
	}

	@Override
	public void delete(E element) {
		delete(root, null, element);
	}
	
	public boolean delete(TreeNode<E> current, TreeNode<E> parent, E elemet) {
		
		if(current == null) return false;
		
		int comp = current.getElement().compareTo(elemet);
		
		if(comp < 0) {
			
		}
		return true;
	}

	@Override
	public E search(E element) {
		// TODO Auto-generated method stub
		return null;
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
		TreeNode<E> temp = this.root;
		while(temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp.getElement();
	}

	@Override
	public E min() {
		TreeNode<E> temp = this.root;
		while(temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getElement();
	}
	
}
