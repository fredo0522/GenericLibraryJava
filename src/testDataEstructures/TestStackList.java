package testDataEstructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataEstructures.StackList;

class TestStackList {
	
	private StackList<String> stack;
	
	void setup1() {
		stack = new StackList<String>();
	}
	
	void setup2() {
		stack = new StackList<String>();
		for(int i = 0; i < 50; i++) {
			stack.push(i + "");
		}
	}
	
	@Test
	void testPush() {
		setup1();
		stack.push("Alfredo");
		stack.push("Bacalao");
		assertTrue(stack.top() != null && stack.getSize() == 2);
	}
	
	@Test
	void testPop() {
		setup2();
		String element = stack.pop();
		String secondElement = stack.pop();
		stack.deleteAll();
		String noElementDeleteAll = stack.pop();
		stack.push("sd");
		stack.pop();
		String poppingLast = stack.pop();
		assertTrue(element.equals("49") && secondElement.equals("48") && 
				noElementDeleteAll == null && poppingLast == null);
	}
	
	@Test
	void testIsEmpty() {
		setup2();
		boolean full = stack.isEmpty();
		stack.deleteAll();
		boolean empty = stack.isEmpty();
		stack.push("Nothing");
		stack.pop();
		boolean afterPop = stack.isEmpty();
		assertTrue(!full && empty && afterPop);
	}
	
	@Test
	void testIsElement() {
		setup2();
		boolean element = stack.isElement("30");
		boolean noElement = stack.isElement("50");
		assertTrue(element && !noElement);
	}
	
	@Test
	void testSearch() {
		
	}
}
