package GUI;

import model.*;

public class Main{

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
		System.out.println(test.getSize() + "");
		
		
		
	}

}
