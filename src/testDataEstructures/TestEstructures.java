package testDataEstructures;

import dataEstructures.*;

public class TestEstructures{

	public static void main(String[] args) {
		LinkedList<String> test = new LinkedList<String>();
		test.addNode("1");
		test.addNode("2");
		test.addNode("3");
		test.addNode("4");
		test.addNode("5");
		test.addNode("6");
		
		System.out.println("Todas las posiciones del arreglo del 1 al 6 son las entradas y el size es: " + test.getSize());
		
		for(int i = 0; i < test.getSize(); i++) {
			System.out.println(test.getElement(i));
		}
		System.out.println("\n");
		
		test.deleteNode(1);
		
		System.out.println("Se elimina la posicion 1 del arreglo y el size es: " + test.getSize());
		for(int i = 0; i < test.getSize(); i++) {
			System.out.println(test.getElement(i));
		}
		System.out.println("\n");
		
		test.deleteNode(0);
		
		System.out.println("Se elimina la posicion 0 del arreglo  y el size es: " + test.getSize());
		for(int i = 0; i < test.getSize(); i++) {
			System.out.println(test.getElement(i));
		}
		System.out.println("\n");
		test.deleteNode(test.getSize() -1);
		
		System.out.println("Se elimina la ultima posicion del arreglo y el size es: " + test.getSize());
		for(int i = 0; i < test.getSize(); i++) {
			System.out.println(test.getElement(i));
		}
		System.out.println("\n");
		
		System.out.println("poscion del valor 4");
		System.out.println(test.search("4") + "\n");
		
		test.assingValue(0, "15");
		test.assingValue(1, "16");
		System.out.println("Se le agrega el valor 15 en la posicion 0 y el valor 16 en la posicion 1");
		for(int i = 0; i < test.getSize(); i++) {
			System.out.println(test.getElement(i));
		}
		System.out.println("\n");
		
		String deleted = test.deleteNode("15");
		System.out.println("Se elimino el elemento " + deleted + " de la lista \n");
		
		String text = test.isEmpty() ? "El arreglo esta vacio": "Arreglo aun tiene cosas adentro";
		System.out.println(text);
		test.deleteAll();
		String text1 = test.isEmpty() ? "El arreglo esta vacio": "Arreglo aun tiene cosas adentro";
		System.out.println(text1);
		System.out.println(test.getSize() + "\n");
		
		//StackList Test
		StackList<String> stack = new StackList<String>();
		
		stack.push("Hola");
		stack.push("Fredo");
		System.out.println(stack.getSize());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isElement("Fredo"));
		stack.pop();
		System.out.println(stack.getSize());
		stack.pop();
		System.out.println(stack.getSize());
		System.out.println(stack.pop());
		System.out.println(stack.getSize());
		System.out.println(stack.search("Hello world"));
		System.out.println(stack.isElement("Fredo"));
		stack.push("Hola");
		stack.push("Fredo");
		stack.assingValue(0, "GodoFredo");
		System.out.println(stack.isElement("GodoFredo"));
		System.out.println(stack.top() + "\n");
		
		
		//QueueList Test
		QueueList<String> queue = new QueueList<String>();
		queue.equeue("Fredo was here");
		System.out.println(queue.front());
		System.out.println(queue.getSize());
		queue.equeue("Fredo");
		queue.equeue("Random Words");
		System.out.println(queue.front());
		System.out.println(queue.getSize());
		System.out.println(queue.dequeue());
		System.out.println(queue.getSize());
		System.out.println(queue.isElement("Random Words"));
	}

}
