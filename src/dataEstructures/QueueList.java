package dataEstructures;

public class QueueList<E> implements QueueInterface<E> {
	
	private Node<E> first;
	private Node<E> last;
	private long size;
	
	public QueueList() {
		this.size = 0;
	}
	
	@Override
	public void equeue(E element) {
		Node<E> newElement = new Node<E>(element);
		if(first == null) {
			first = newElement;
			last = newElement;
			size++;
		}else {
			last.setNext(newElement);
			last = newElement;
			size++;
		}
			
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public E front() {
		return first.getElement();
	}

	@Override
	public E dequeue() {
		if(size != 0) {
			Node<E> temp = first;
			first = first.getNext();
			size--;
			return temp.getElement();	
		}
		return null;
	}

	@Override
	public void deleteAll() {
		this.size = 0;
		first = null;
		last = null;
	}

	@Override
	public long getSize() {
		return this.size;
	}

	@Override
	public boolean isElement(E element) {
		if(first != null) {
			Node<E> temp = first;
			while(temp != null) {
				if(temp.getElement().equals(element)) return true;
				temp = temp.getNext();
			}
		}
		return false;
	}	
}
