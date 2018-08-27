package model;

public interface LinkedListInterface<T> {
	public boolean addNode(T element);
	public boolean assingValue(long pos, T element);
	public boolean deleteNode(long pos);
	public T deleteNode(T element);
	public long getSize();
	public boolean isElementInList(T element);
	public long search(T element);
	public T getElement(long pos);
	public boolean isEmpty();
	public void deleteAll();
	public long indexOf(T element);
}
