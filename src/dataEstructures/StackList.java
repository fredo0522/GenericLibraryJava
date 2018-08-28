package dataEstructures;

public class StackList<E> implements StackListInterface<E>{
	
	private long size;
	private Node<E> top;
	
	public StackList() {
		this.size = 0;
	}
	
	@Override
	public boolean push(E element) {
		top = new Node<E>(element,this.top);
		size++;
		return true;	
	}

	@Override
	public E pop() {
		if(size != 0) {
			Node<E> temp = top;
			top = top.getNext();
			size--;
			return temp.getElement();
		}
		return null;
	}

	@Override
	public E top() {
		if(top != null) return top.getElement();
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (top == null);
	}
	
	@Override
	public long getSize() {
		return this.size;
	}

	@Override
	public void deleteAll() {
		top = null;
		size = 0;
	}

	@Override
	public boolean isElement(E element) {
		if(top != null) {
			Node<E> temp = top.getNext(); 
			if(top().equals(element)) return true;
			for (long i = 0; i < size-1; i++) {
				if(temp.getElement().equals(element)) {
					return true;
				}
				temp = temp.getNext();
			}
		}		
		return false;
	}

	@Override
	public long search(E element) {
		if(top != null) {
			if(element.equals(top.getElement())) return size - 1;
			Node<E> temp = top.getNext();
			for(long i = size -2; i >= 0; i--) {
				if(temp.getElement().equals(element)) {
					return i;
				}
				temp = temp.getNext();
			}
		}		
		return -1;
	}

	@Override
	public boolean assingValue(long pos, E element) {
		Node<E> temp = top;
		while(temp != null) {
			if(search(temp.getElement()) == pos) {
				temp.setElement(element);
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
}
