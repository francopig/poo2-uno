package e4.arrayPares;


/* 4. Escribir una función que reciba un arreglo de enteros y devuelva la suma de los
elementos que se encuentran en posiciones pares (incluido el elemento de la
posición 0). Por ejemplo:
Dado el arreglo [1, 2, 13 ,4, 8, 6] devuelve 22 (1+13+8) */

public class Ej4 {
	
	int arr[];
	
	public Ej4(int[] arr) {
		this.arr = arr;
	}
	
	
	public int sumaElementosPares () {
		
		int suma = 0;
		for (int i = 0; i < arr.length; i = i+2) {
			suma += arr[i];
		}
		return suma;
	}
	
	
	
	public static void main(String[] args) {
		
		//int[] arr = {10,2,30,4,50,6};
		//System.out.println(sumaElementosPares(arr)); //debería retornar 90
		
		
		int arreglo1[] = {5,10,15,20,25,30}; //5+15+25 = 45
		Ej4 instancia1 = new Ej4( arreglo1 );
		System.out.println(instancia1.sumaElementosPares());
		
		int arreglo2[] = {1,2,3,4,5,6}; // 9
		Ej4 instancia2 = new Ej4( arreglo2 );
		System.out.println(instancia2.sumaElementosPares());
		
	}
}

