package model;

public interface SimpleLinkedList<T> {
	public boolean addNode(T element);
	public boolean assingValue(int pos, T element);
	public boolean deleteNode(int pos);
	public T deleteNode(T element);
	public int getSize();
	public boolean isElementInList(T element);
	public int search(T element);
	public T getElement(int pos);
	public boolean isEmpty();
	public void deleteAll();
	public int indexOf(T element);
}
