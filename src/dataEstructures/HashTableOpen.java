package dataEstructures;

import java.util.ArrayList;

public class HashTableOpen<K,T> implements HashTableInterface<K,T> {
	
	private ArrayList<NodeKey<K, T>> hashOpenTable;
	private int maxHashTable;
	private int size;
	private NodeKey<K, T> dummy;
	
	public HashTableOpen() {
		maxHashTable = 13;
		hashOpenTable = new ArrayList<NodeKey<K,T>>();
		this.size = 0;
		for(int i = 0; i < maxHashTable; i++) {
			hashOpenTable.add(null);
		}
		dummy = new NodeKey<K, T>(null, null);
	}
	
	@Override
	public int hashFunction(K key) {
		return Math.abs(key.hashCode()) % maxHashTable;
	}
	
	@Override
	public void insert(K key, T element) {
		NodeKey<K, T> adding = new NodeKey<>(key, element);
		int hash = hashFunction(key);
		while(hashOpenTable.get(hash) != null && !hashOpenTable.get(hash).equals(key)) {
			hash++;
			hash %= maxHashTable;
		}
		if(hashOpenTable.get(hash) == null || hashOpenTable.get(hash).getKey() == dummy) {
			hashOpenTable.set(hash, adding);
			this.size++;
		}
	}

	@Override
	public T delete(K key) {
		int hash = hashFunction(key);
		while(hashOpenTable.get(hash) != null) {
			if(hashOpenTable.get(hash).getKey().equals(key)) {
				NodeKey<K,T> temp = hashOpenTable.get(hash);
				hashOpenTable.set(hash, dummy);
				size--;
				return temp.getElement();
			}
			hash++;
			hash %= maxHashTable;
		}
		return null;
	}

	@Override
	public T search(K key) {
		int hash = hashFunction(key);
		while(hashOpenTable.get(hash) != null) {
			if(hashOpenTable.get(hash).getKey().equals(key)) {
				return hashOpenTable.get(hash).getElement();
			}
			hash++;
			hash %= maxHashTable;
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
	
	public int getMaxTable() {
		return this.maxHashTable;
	}

}
