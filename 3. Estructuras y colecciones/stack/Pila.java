package stack;

import java.util.Stack; //La estructura ya viene creada en Java

public class Pila {
	public static void main(String[] args) {
		
		//Definición de una pila
		Stack<Integer> pila1 = new Stack<Integer>();
		
		System.out.println("Contenido del a pila: " + pila1);
		System.out.println("¿Está vacia la pila? --> " + pila1.isEmpty());
		
		/** Método push() recibe como argumento el elemento a agregar al final de la pila*/
		pila1.push(2);
		pila1.push(4);
		pila1.push(6);
		pila1.push(8);
		
		System.out.println("Contenido del a pila: " + pila1); // [2, 4, 6, 8]

		
		/**El método pop() elimina el último elemento de la pila*/
		pila1.pop();
		System.out.println("Contenido del a pila: " + pila1);  // [2, 4, 6]
		
		
		/**El método peek() toma el último elemento de la pila*/
		System.out.println("El tope de la pila es: " + pila1.peek()); // 6
		
		
		/**El método search() busca el argumento que se le pase dentro de la pila*/
		System.out.println("Se encuentra el 5 " + pila1.search(5));
		System.out.println("Se encuentra el 6 " + pila1.search(6));
		
		//Recorrer una pila utilizando un for Each
		for(Integer elemento : pila1) {
			System.out.println(elemento);
		}
		
		
	}

}
