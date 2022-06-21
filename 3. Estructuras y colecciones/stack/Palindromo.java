package stack;

import java.util.Stack;

/* Consigna: Utilizando pilas, averiguar si un String dado es una palabra palíndroma
 (Se lee igual en ambos sentidos, por ejemplo: oso, radar ,seres, somos, etc…) */


public class Palindromo {
	public static void main(String[] args) {
		
		
		String palabra1 = "asimov";
		String palabra2 = "oso";
		String palabra3 = "seres";
		
		System.out.println(esPalindromo(palabra1));
		System.out.println(esPalindromo(palabra2));
		System.out.println(esPalindromo(palabra3));
		
		
	}
	
	static boolean esPalindromo(String palabra) {
		Stack<Character> pila1 = new Stack<Character>();
		
		//1. Almacenamos cada caracter de la palabra en la pila
		for(int i = 0; i < palabra.length(); i++) {
			pila1.push(palabra.charAt(i));
		}
		
		//2. Desapilamos la pila y la almacenamos en un String
		String desapilada = "";
		
		while(!pila1.empty()) {
			desapilada+= pila1.pop();
		}
		//System.out.println("Pila desapilada = " + desapilada);
		
	
		//3. Comprobamos si es palindromo y retornamos
		return (palabra == desapilada);
		
	}

}
