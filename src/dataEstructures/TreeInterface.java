package dataEstructures;

public interface TreeInterface <T> {
	public void insert(T element);
	public boolean delete(T element);
	public T search(T element);
	public boolean isEmpty();
	public T root();
	public T max();
	public T min();
	public long size();
}
