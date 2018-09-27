package dataEstructures;

public interface StackListInterface<T> {
	public boolean push(T element);
	public T pop();
	public T top();
	public boolean isEmpty();
	public long getSize();
	public void deleteAll();
	public boolean isElement(T element);
}
