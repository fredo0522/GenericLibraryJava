package testDataEstructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataEstructures.QueueList;

class TestQueueList {
	
	private QueueList<String> queue;
	
	void setup1() {
		queue = new QueueList<String>();
	}
	
	void setup2() {
		queue = new QueueList<String>();
		for(int i = 0; i < 50; i++) {
			queue.equeue(i + "");
		}
	}
	
	@Test
	void testEqueue() {
		setup1();
		queue.equeue("Alfredo");
		queue.equeue("Alejito");
		assertTrue(queue.front().equals("Alfredo"));
	}
	
	@Test
	void testDequeue() {
		setup2();
		String element = queue.dequeue();
		String secondElement = queue.dequeue();
		queue.deleteAll();
		String noElement = queue.dequeue();
		assertTrue(element.equals("0") && secondElement.equals("1") && noElement == null);
	}
	
	@Test
	void testIsEmpty() {
		setup1();
		boolean beforeEverything = queue.isEmpty();
		queue.equeue("Anaximandro");
		boolean afterAdding = queue.isEmpty();
		queue.dequeue();
		boolean afterDeleted = queue.isEmpty();
		assertTrue(beforeEverything && !afterAdding && afterDeleted);
	}
	
	@Test
	void testIsElement() {
		setup2();
		boolean firstElement = queue.isElement("0");
		boolean betweenElement = queue.isElement("30");
		boolean noElement = queue.isElement("61");
		assertTrue(firstElement && betweenElement && !noElement);
	}

}
