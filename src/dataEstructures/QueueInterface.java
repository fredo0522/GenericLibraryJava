package dataEstructures;

public interface QueueInterface<T> {
	public void equeue(T element);
	public boolean isEmpty();
	public T front();
	public T dequeue();
	public void deleteAll();
	public long getSize();
	public boolean isElement(T element);
}
