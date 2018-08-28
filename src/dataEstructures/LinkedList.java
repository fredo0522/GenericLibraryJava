package dataEstructures;

public class LinkedList<E> implements LinkedListInterface<E>{
	
	private Node<E> first;
	private Node<E> last;
	private long size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	@Override
	public boolean addNode(E element) {
		
		Node<E> node = new Node<E>(element);
		
		if(first == null) {
			first = node;
			last = node;
			size++;
		}else {
			last.setNext(node);
			last = node;
			size++;
		}
		
		return true;
	}
	
	@Override
	public boolean assingValue(long pos, E element) {
		Node<E> temp = first;
		while(temp != null) {
			if(indexOf(temp.getElement()) == pos) {
				temp.setElement(element);
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public boolean deleteNode(long pos) {
		if(pos == 0) {
			deleteFirstNode();
			return true;
		}else if (pos > 0 && pos < size - 1) {
			deleteBetweenNode(pos);
			return true;
		}else if( pos == size -1){
			deleteLast();
			return true;
		}
		return false;
	}

	@Override
	public E deleteNode(E element) {
		long pos = search(element);
		if(pos != -1) {
			E result = getElement(pos);
			deleteNode(pos);
			return result;
		}
		return null;
	}

	@Override
	public long getSize() {
		return this.size;
	}

	@Override
	public boolean isElementInList(E element) {
		return search(element) != -1 ? true : false;
	}
	
	@Override
	public long search(E element) {
		Node<E> temp = first;
		while(temp != null) {
			if(temp.getElement().equals(element)) {
				return indexOf(temp.getElement());
			}
			temp = temp.getNext();
		}
		return -1;
	}

	@Override
	public E getElement(long pos) {
		Node<E> temp = first;
		if(pos == 0) {
			return temp.getElement();
		}else if(pos > 0 && pos < size -1) {
			while(temp != null) {
				if(indexOf(temp.getElement()) == pos) return temp.getElement();
				temp = temp.getNext();
			}
		}else if(pos == size -1) {
			return last.getElement();
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return first == null && last == null ? true : false;
	}

	@Override
	public void deleteAll() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	@Override
	public long indexOf(E element) {
		long index = 0;
	    Node<E> current = first;

	    while (current != null) {
	        if (current.getElement().equals(element)) {
	            return index;
	        }
	        index++;
	        current = current.getNext();
	    }
	    return -1;
	}

	private void deleteFirstNode() {
		if(first != null) {
			Node<E> tmp = first;
			first = tmp.getNext();
			if (first == null) last = null;
			size--;
		}
	}
	
	private void deleteBetweenNode(long pos) {
		Node<E> before = first;
		for(long i = 0; i < pos -1; i++) {
			before = before.getNext();
		}
		Node<E> temp = before.getNext();
		Node<E> after = temp.getNext();
		before.setNext(after);
		temp.setNext(null);
		size --;
	}
	
	private void deleteLast() {
		Node<E> lastNode = first;
		Node<E> before = null;
		
		while(lastNode.getNext() != null) {
			before = lastNode;
			lastNode = lastNode.getNext();
		}
		before.setNext(null);
		this.last = before;
		size--;
	}
}
