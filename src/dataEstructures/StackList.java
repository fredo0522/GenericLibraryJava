package dataEstructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StackList<E> implements StackListInterface<E>{
	
	private long size;
	private Node<E> top;
	
	public StackList() {
		this.size = 0;
	}
	
	@Override
	public boolean push(E element) {
		if(size == 0) {
			top = new Node<E>(element);
			size++;
			return true;
		}else {
			Node<E> temp = new Node<E>(element);
			temp.setNext(top);
			top = temp;
			size++;
			return true;
		}
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
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String k = in.readLine();
		char[] ks = k.toCharArray();
		int n = Character.valueOf(ks[0]);
				
		out.write(n);
		out.close();
	}
}
