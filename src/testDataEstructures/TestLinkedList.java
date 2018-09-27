package testDataEstructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataEstructures.LinkedList;

class TestLinkedList {
	
	private LinkedList<String> linkedList;
	
	void setup1() {
		linkedList = new LinkedList<String>();
	}
	
	void setup2() {
		linkedList = new LinkedList<String>();
		for(int i = 0; i < 50; i++) {
			linkedList.addNode(i + "");
		}
	}
	
	@Test
	void testAdding() {
		setup1();
		linkedList.addNode("Fredo");
		linkedList.addNode("Alejito");
		assertTrue(linkedList.getElement(0) == "Fredo" && linkedList.getElement(1) == "Alejito");
	}
	
	@Test
	void testDeleteFirst() {
		setup2();
		linkedList.deleteNode(0);
		assertTrue(!linkedList.getElement(0).equals("0") && linkedList.getSize() == 49);
	}
	
	@Test
	void testDeleteBetween() {
		setup2();
		linkedList.deleteNode(30);
		assertTrue(!linkedList.getElement(30).equals("30") && linkedList.getSize() == 49);
	}
	
	@Test
	void testDeleteLast() {
		setup2();
		linkedList.deleteNode(49);
		assertTrue(linkedList.getElement(49) == null && linkedList.getSize() == 49 &&
				linkedList.getElement(48).equals("48"));
	}
	
	@Test
	void testIsElement() {
		setup2();
		boolean element = linkedList.isElement("30");
		boolean noElement = linkedList.isElement("50");
		assertTrue(element && !noElement);
	}
	
	@Test
	void testIsEmptyAddingNode() {
		setup1();
		boolean first = linkedList.isEmpty();
		linkedList.addNode("50");
		boolean after = linkedList.isEmpty();
		linkedList.deleteNode(0);
		boolean afterDelete = linkedList.isEmpty();
		assertTrue(first && !after && afterDelete);
	}
	
	@Test
	void testIsEmptyWithDeleteAll() {
		setup2();
		boolean before = linkedList.isEmpty();
		linkedList.deleteAll();
		boolean after = linkedList.isEmpty();
		assertTrue(!before && after);
	}
	
	@Test
	void testSearch() {
		setup2();
		long index1 = linkedList.search("18");
		long index2 = linkedList.search("50");
		assertTrue(index1 == 18 && index2 == -1);
	}
	
	@Test
	void testIndexOf() {
		setup2();
		long index1 = linkedList.indexOf("50");
		long index2 = linkedList.indexOf("18");
		assertTrue(index1 == -1 && index2 == 18);
	}
	
	@Test
	void testGetElement() {
		setup2();
		String element = linkedList.getElement(0);
		String secondElement = linkedList.getElement(50);
		assertTrue(element.equals("0") && secondElement == null);
		
	}

}
