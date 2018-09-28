package dataEstructures;

import java.util.ArrayList;

public class HashTable<K, T> implements HashTableInterface<K, T>{
	
	private ArrayList<NodeKey<K, T>> hashTable;
	private int size;
	private int capacity;
	
	public HashTable(K key, T element) {
		hashTable = new ArrayList<NodeKey<K, T>>();
		this.size = 0;
		this.capacity = 13;
		for(int i = 0; i < capacity; i++) {
			hashTable.add(null);
		}
	}
	
	@Override
	public void insert(K key, T element) {
		int hash = hashFunction(key);
		NodeKey<K,T> head = hashTable.get(hash);
		
		while (head != null) {
			if(head.getKey().equals(key)) {
				head.setElement(element);
				return;
			}
			head = head.getNext();
		}
		
		this.size++;
		head = hashTable.get(hash);
		NodeKey<K,T> adding = new NodeKey<K,T>(key, element);
		adding.setNext(head);
		hashTable.set(hash, adding);
		
		if((1.0 * size) / capacity >= 0.7) {
			ArrayList<NodeKey<K,T>> temp = hashTable;
			hashTable = new ArrayList<>();
			capacity *= 2;
			this.size = 0;
			
			for(int i = 0; i < capacity; i++) {
				hashTable.add(null);
			}
			
			for(NodeKey<K,T> headNode : temp) {
				while(headNode != null) {
					insert(headNode.getKey(), headNode.getElement());
					headNode = headNode.getNext();
				}
			}
		}
		
	}

	@Override
	public T delete(K key) {
		int hash = hashFunction(key);
		NodeKey<K,T> head = hashTable.get(hash);		
		NodeKey<K,T> before = null;

		while(head != null) {
			if(head.getKey().equals(key)) {
				break;
			}
			
			before = head;
			head = head.getNext();
		}
				
		if(head == null) return null;
		
		size--;
		
		if(before != null) before.setNext(head.getNext());
		else hashTable.set(hash, head.getNext());				
		
		return head.getElement();
	}

	@Override
	public T search(K key) {
		int hash = hashFunction(key);
		NodeKey<K,T> head = hashTable.get(hash);
				
		while(head != null) {
			if(head.getKey().equals(key)) return head.getElement();
			head = head.getNext();
		}
		return null;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int hashFunction(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

}
