package testDataEstructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataEstructures.BinarySearchTree;

class TestBinarySearchTree {
	
	private BinarySearchTree<Integer> bst;
	
	
	void setUp1() {
		bst = new BinarySearchTree<Integer>();
	}
	
	void setUp2() {
		setUp1();
		bst.insert(20);
		bst.insert(15);
		bst.insert(30);
		bst.insert(25);
		bst.insert(7);
		bst.insert(2);
		bst.insert(12);
		bst.insert(16);
	}
	
	
	@Test
	void testInsert() {
		setUp1();
		boolean before = bst.isEmpty();
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		boolean after = bst.isEmpty();
		assertTrue(bst.root() == 2 && bst.search(1) == 1 && !after && before);
	}
	
	@Test
	void testSearch() {
		setUp2();
		int numberSearch = bst.search(12);
		Object noSearch = bst.search(50);
		assertTrue(numberSearch == 12 && noSearch == null);
	}
	
	@Test
	void testDelete() {
		setUp2();
		bst.delete(20);
		bst.delete(2);
		bst.delete(30);
		assertTrue(bst.root() == 25 && bst.size() == 5);
	}

}
